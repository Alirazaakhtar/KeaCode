import java.util.Random;

public class Apple {

    private int x;
    private int y;

    Random random = new Random();


    public Apple() {
        x = random.nextInt(10)+1;
        y = random.nextInt(10)+1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void changePosition(){
        x = random.nextInt(10)+1;
        y = random.nextInt(10)+1;
    }

    public void showApple(){
        System.out.println("The apple is on position x = " + x + ", y = " + y);
    }
}
