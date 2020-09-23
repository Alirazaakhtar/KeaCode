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


        while (true){

            String chat = keyboardInput();

                //System.out.print("Mig: ");
            printWriter.println(chat);

            if(chat.equalsIgnoreCase("quit")){
                break;
            }


        }

    }

    public String keyboardInput(){

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}
