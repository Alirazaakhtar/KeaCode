import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandler implements Runnable {

    private Server server;
    private Socket socket;

    public ClientHandler(Server server, Socket socket) {
        this.server = server;
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            Scanner scanner = new Scanner(socket.getInputStream());

            //Her tilføjes socket der sender sin første besked i en MAP,
            //Hvor den første besked er navnet på klienten
            server.getSocketNameMap().put(socket, scanner.nextLine());

            while (true){

                String chatClient = scanner.nextLine();

                // Her bliver navnet hentet på klienten som sender en besked
                // og bliver sat ind sendToAllClient()
                //hvor beskeden og navnet på hvem der har sendt beskeden bliver vist til alle
                String name = server.getSocketNameMap().get(socket);

                if(chatClient.equalsIgnoreCase("quit")){
                    server.getSocketSet().remove(socket);
                }
                else {
                    sendToAllClient(chatClient, name);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public void sendToAllClient(String str, String name){

        for (Socket socket: server.getSocketSet()){
            try {

                PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
                pw.println(name + ": " + str);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
