package test1;

public class Medarbejder implements Runnable{

    private Burger burger;
    private int counter;

    public Medarbejder(Burger burger) {
        this.burger = burger;
    }

    @Override
    public void run() {

        while (counter < 100){
            burger.increment();
            counter++;

        }



    }
}
