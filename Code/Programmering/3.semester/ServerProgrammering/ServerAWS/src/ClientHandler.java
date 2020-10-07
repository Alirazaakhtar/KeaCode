import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandler implements Runnable {

    private Socket socket;
    private Server server;

    public ClientHandler(Socket socket, Server server) {
        this.socket = socket;
        this.server = server;
    }

    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(socket.getInputStream());

            server.getNames().put(socket, scanner.nextLine());

            while (true){
                String msg = scanner.nextLine();
                String name = server.getNames().get(socket);
                System.out.println(msg);
                sendToAll(msg, name);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static String keyboard(){
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    public void sendToAll(String msg, String name){
        for (Socket s : server.getSocketSet()) {
            try {
                PrintWriter printWriter = new PrintWriter(s.getOutputStream(), true);
                printWriter.println(name + ": " + msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
