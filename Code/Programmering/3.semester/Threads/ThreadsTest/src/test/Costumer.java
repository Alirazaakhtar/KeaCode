package test;

public class Costumer implements Runnable {

    private Burger burger;
    private int counter;


    public Costumer(Burger burger) {
        this.burger = burger;
    }

    @Override
    public void run() {

        while (counter < 10){
            burger.decrement();
            counter++;
        }


    }
}

