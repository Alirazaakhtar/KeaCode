import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class KlientS {

    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1338)){

            //sender
            System.out.println("Er forbundet med server");
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);




            //Modtager
            Scanner scanner = new Scanner(socket.getInputStream());


            ServerThread serverThread = new ServerThread(scanner, "Server");
            Thread t1 = new Thread(serverThread);
            t1.start();

            while (true){
                System.out.print("Mig: ");
                pw.println(keyboardScan());



//                System.out.print("fra server: ");
//                System.out.println(scanner.nextLine()); // blokerer
            }



            //scanner.close();
            //pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    static String keyboardScan(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
