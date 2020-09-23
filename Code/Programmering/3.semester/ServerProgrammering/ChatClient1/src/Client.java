import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {


    public static void main(String[] args) {

        try (Socket socket = new Socket("localhost", 1341);
        ) {


            Scanner scanner = new Scanner(socket.getInputStream());

            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            KeyboardInputThread kit = new KeyboardInputThread(pw, scanner);
            Thread t1 = new Thread(kit);
            t1.start();

            while (true){

                //System.out.print("Client: ");
                System.out.println(scanner.nextLine());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
