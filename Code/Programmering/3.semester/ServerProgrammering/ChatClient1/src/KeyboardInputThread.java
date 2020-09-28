import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class KeyboardInputThread implements Runnable {


    private PrintWriter printWriter;
    private Scanner scanner;

    public KeyboardInputThread(PrintWriter printWriter, Scanner scanner) {
        this.printWriter = printWriter;
        this.scanner = scanner;
    }

    @Override
    public void run() {

        System.out.print("Type your name to start: ");

        while (true){

            String chat = keyboardInput();
                printWriter.println(chat);



        }

    }

    public String keyboardInput(){

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }




}
