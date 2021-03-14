package test;

public class BurgerBar {


    public static void main(String[] args) {

        Burger burger = new Burger();

        Worker worker = new Worker(burger);
        Costumer costumer = new Costumer(burger);

        Thread t1 = new Thread(worker);
        Thread t2 = new Thread(costumer);

        t1.start();
        t2.start();
    }
}
