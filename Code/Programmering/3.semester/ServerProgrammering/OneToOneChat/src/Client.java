import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        try (Socket socket = new Socket("localhost", 1340);) {

            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            Scanner scanner = new Scanner(socket.getInputStream());

            KeyboardExecute kx = new KeyboardExecute(pw);
            Thread t1 = new Thread(kx);
            t1.start();

            while (true){


                String msg = scanner.nextLine();

                if(!msg.isEmpty()){
                    System.out.print("\nServer: ");
                    System.out.println(msg);
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static String keyboardInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
