package test;

public class Worker implements Runnable {

    private Burger burger;

    private int counter;

    public Worker(Burger burger) {
        this.burger = burger;
    }

    @Override
    public void run() {

        //hvor mange gange skal den kører?
        while (counter < 10){
            burger.increment();
            counter++;
        }

    }
}
