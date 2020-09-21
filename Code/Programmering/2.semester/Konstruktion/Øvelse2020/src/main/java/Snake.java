import java.util.Scanner;

public class Snake {

    private String name;
    private int x;
    private int y;
    private int score;

    Apple apple = new Apple();
    Scanner scan = new Scanner(System.in);



    public Snake(String name) {
        this.name = name;
        x = 0;
        y = 0;

    }

    public void move() {

        System.out.println("press w = UP, s = down, a = left, d = right");

        do {
            String button = scan.next();

            if (button.equals("w") && y < 10) {
                this.y++;
            }

            if (button.equals("s") && y > 0) {
                this.y--;
            }

            if (button.equals("d") && x < 10) {
                this.x++;
            }

            if (button.equals("a") && x > 0) {
                this.x--;
            }

            if(x == apple.getX() && y == apple.getY()){
                score++;
                apple.changePosition();
            }

            if(score == 5){
                break;
            }

            System.out.println("The position of the " + name + " is x = " + x + ", y = " + y);
            apple.showApple();
            System.out.println("Score: " + score);



        } while (true);
    }
}
