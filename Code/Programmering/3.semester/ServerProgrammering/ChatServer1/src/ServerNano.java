import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;


public class ServerNano {


    public ServerNano() {
        try (ServerSocket serverSocket = new ServerSocket(9090);) {


            System.out.println("Server klar til klient");

            while (true){

                Socket socket = serverSocket.accept();
                System.out.println("Klient forbundet");

                PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
                printWriter.println("Hej fra Server ");
                printWriter.close();


            }



        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new ServerNano();


    }


}


