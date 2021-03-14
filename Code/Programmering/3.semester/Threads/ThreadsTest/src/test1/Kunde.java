package test1;

public class Kunde implements Runnable {

    private Burger burger;
    private int counter;

    public Kunde(Burger burger) {
        this.burger = burger;
    }

    @Override
    public void run() {

        while (counter < 100){
            burger.decrement();
            counter++;

        }


    }
}
