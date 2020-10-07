import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class Server {

    private Set<Socket> socketSet = new HashSet<>();
    private Map<Socket, String> names = new HashMap<>();

    public Server() {

        try (ServerSocket serverSocket = new ServerSocket(9090);) {
            System.out.println("waiting for connection");

            while (true){
                Socket socket = serverSocket.accept();
                System.out.println("Client connected");
                socketSet.add(socket);



                ClientHandler clientHandler = new ClientHandler(socket, this);
                Thread thread = new Thread(clientHandler);
                thread.start();



            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }




    public Set<Socket> getSocketSet() {
        return socketSet;
    }

    public Map<Socket, String> getNames() {
        return names;
    }

    public static void main(String[] args) {


        new Server();


    }

}
