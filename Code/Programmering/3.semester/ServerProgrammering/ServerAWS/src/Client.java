import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Client {


    public static void main(String[] args) {

        try {
            Socket socket = new Socket("34.234.94.111", 8090);

            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);

            InputHandler inputHandler = new InputHandler(socket);
            Thread thread = new Thread(inputHandler);
            thread.start();

            System.out.print("Type your name to start: ");
            printWriter.println(keyboard());

            while (true){
                printWriter.println(keyboard());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static String keyboard(){
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }
}
