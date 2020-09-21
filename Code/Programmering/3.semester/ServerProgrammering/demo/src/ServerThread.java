import java.util.Scanner;

public class ServerThread implements Runnable{

    private Scanner scanner;
    private String name;

    public ServerThread(Scanner scanner, String name){
        this.scanner = scanner;
        this.name = name;
    }

    @Override
    public void run() {
        getMessage(scanner);
    }

    public void getMessage(Scanner scanner){

        while (true){
            System.out.print("Modtager fra " + name + ": ");
            System.out.println(scanner.nextLine()); // lytter
        }

    }

}
