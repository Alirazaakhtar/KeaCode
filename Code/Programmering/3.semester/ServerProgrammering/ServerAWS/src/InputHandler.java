import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class InputHandler implements Runnable{


    private Socket socket;


    public InputHandler(Socket socket) {
        this.socket = socket;

    }

    @Override
    public void run() {

        try {
            Scanner scanner = new Scanner(socket.getInputStream());

            while (true){
                String msg = scanner.nextLine();
                System.out.println(msg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
