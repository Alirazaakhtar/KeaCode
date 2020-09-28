import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Server {


    private Set<Socket> socketSet = new HashSet<>();
    private Map<Socket, String> socketNameMap = new HashMap<>();
    public static void main(String[] args) {
        new Server();
    }

    public Server() {
        try (ServerSocket serverSocket = new ServerSocket(1341);){

            while (true){
                System.out.println("Server klar til klient");
                Socket socket = serverSocket.accept();
                System.out.println("Klient forbundet");
                // tilføj den nye socket til Set
                socketSet.add(socket);



                ClientHandler clientHandler = new ClientHandler(this, socket); // "this" refererer til klassen
                Thread t1 = new Thread(clientHandler);
                t1.start();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Set<Socket> getSocketSet() {
        return socketSet;
    }

    public Map<Socket, String> getSocketNameMap() {
        return socketNameMap;
    }
}
