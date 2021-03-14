package test1;

public class Burger {

    private int burger;



    public synchronized void increment(){

        while (burger > 7){

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        burger++;
        notifyAll();
        System.out.println("Burger = " + burger + " fra tråd: " + Thread.currentThread().getName());


    }

    public synchronized void decrement(){

        while (burger < 1){

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        burger--;
        notifyAll();
        System.out.println("Burger = " + burger + " fra tråd: " + Thread.currentThread().getName());


    }

}
