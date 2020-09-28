import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DataServer {
    private static String[] names = {"Wily", "Felix, Carlsabad", "Hobob"};
    private static String[] adje = {"the gentle", "the un-gentle", "the overwroght", "the urbane"};
    private static final int PORT = 9090;

    private static ArrayList<ClientHandler> clients = new ArrayList<>();
    private static ExecutorService pool = Executors.newFixedThreadPool(4);

    public static void main(String[] args) {


        try (ServerSocket listener = new ServerSocket(PORT);
        ) {


            while(true){
                System.out.println("[Server] waiting for client connection");
                Socket client = listener.accept();
                ClientHandler clientHandlerT = new ClientHandler(client);
                clients.add(clientHandlerT);

                pool.execute(clientHandlerT);
            }

//
//            ClientHandler clientHandler = new ClientHandler(client);
//            Thread t1 = new Thread(clientHandler);
//            t1.start();


                // sender til client
            //PrintWriter out = new PrintWriter(client.getOutputStream(), true);



                // modtager

           // BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));




        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getRandomName() {
        String name = names[(int) (Math.random() * names.length)];
        String adj = adje[(int) (Math.random() * adje.length)];
        return name + " " + adj;
    }

    public static ArrayList<ClientHandler> getClients() {
        return clients;
    }
}
