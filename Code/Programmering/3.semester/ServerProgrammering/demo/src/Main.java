import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            // husker at lukke serversocket i try() selv
        try (ServerSocket serverSocket = new ServerSocket(1338)){

            //Modtager
            System.out.println("Server klar til klient:");
            Socket socket = serverSocket.accept(); // blokerer
            Scanner scanner = new Scanner(socket.getInputStream());

//

            //sender
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            ServerThread serverThread = new ServerThread(scanner, "Client");
            Thread t1 = new Thread(serverThread);
            t1.start();


            while (true){

//                System.out.print("Modtager fra klient: ");
//                System.out.println(scanner.nextLine()); // lytter

                System.out.print("Mig: ");
                pw.println(keyboardScan());


            }


           // scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("fejl i serversocket");
        }



    }
    static String keyboardScan(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}
