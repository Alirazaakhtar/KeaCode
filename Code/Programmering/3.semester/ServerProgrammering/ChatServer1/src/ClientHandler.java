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


            while (true){

                String chatClient = scanner.nextLine();


                if(chatClient.equalsIgnoreCase("quit")){
                    server.getSocketSet().remove(socket);
                }
                else {
                    sendToAllClient(chatClient);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public void sendToAllClient(String str){

        for (Socket socket: server.getSocketSet()){
            try {
                PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
                pw.println(str);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
