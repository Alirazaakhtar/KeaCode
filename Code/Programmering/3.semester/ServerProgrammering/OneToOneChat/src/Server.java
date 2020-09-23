import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {


        try (ServerSocket serverSocket = new ServerSocket(1340);){

            Socket socket = serverSocket.accept();
            System.out.println("Server ready for client...");

            Scanner scanner = new Scanner(socket.getInputStream());

            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            KeyboardExecute kx = new KeyboardExecute(pw);
            Thread t1 = new Thread(kx);
            t1.start();



            while (true){

                String msg = scanner.nextLine();

                if(!msg.isEmpty()){
                    System.out.print("\nClient: ");
                    System.out.println(msg);
                }


            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
