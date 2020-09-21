import java.util.Scanner;

public class Game {


    public static void main(String[] args) {



        Snake snake = new Snake("SnakeKiller");
        Apple apple = new Apple();

        while (true) {
            try {
                Scanner scan = new Scanner(System.in);

                System.out.println("\n------------------------------");
                System.out.println("1: Play game");
                System.out.println("2: See last game score");
                System.out.println("0: Exit game");
                System.out.println("------------------------------");
                System.out.print("Type a number to choose menu: ");
                int select = scan.nextInt();

                if (select == 1) {

                  snake.move();
                }

                if (select == 2) {

                }

                if (select == 0) {
                    break;
                }

                if (select > 2) {
                    System.out.println("\nChoose between the optional menu 0-2!");
                }
            } catch (Exception e) {
                System.out.println("\nWrong input!! Try again with a Integer");
            }


        }

    }


}
