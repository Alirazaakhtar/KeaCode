import java.io.PrintWriter;
import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {


    public void chatMenu() {


        System.out.println("Welcome to FaceChat:");
        System.out.println("1: Group chat");
        System.out.println("2: Private chat");
        System.out.println("0: Exit");


        while (true) {





            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Type a number from the menu: ");
                int selected = scanner.nextInt();

                if (selected == 1) {

                    try (Socket socket = new Socket("localhost", 1341);
                    ) {


                        scanner = new Scanner(socket.getInputStream());

                        PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

                        InputHandler kit = new InputHandler(pw, scanner);
                        Thread t1 = new Thread(kit);
                        t1.start();


                        while (true) {


                            String response = scanner.nextLine();
                            //System.out.print("Client: ");
                            System.out.println(response);


                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }

                if (selected == 2) {

                }
                if (selected == 0) {
                    break;
                }
                if (selected > 2 || selected < 0) {
                    System.out.println("Try again");
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input. try with Integer");
            }


        }


    }

}
