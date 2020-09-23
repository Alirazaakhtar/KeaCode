import java.io.PrintWriter;
import java.util.Scanner;

public class KeyboardExecute implements Runnable {


    private PrintWriter printWriter;

    public KeyboardExecute(PrintWriter printWriter) {
        this.printWriter = printWriter;
    }

    @Override
    public void run() {

        while (true){
            System.out.print("Mig: ");
            printWriter.println(keyboardInput());
        }

    }

    public String keyboardInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
