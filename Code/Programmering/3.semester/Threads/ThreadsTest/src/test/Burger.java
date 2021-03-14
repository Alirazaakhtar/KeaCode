package test;

public class Burger {

    private int burger;


    public synchronized void increment(){

        while (burger > 7){
            try {
                wait(); // venter og lytter til notify fra andre tråde
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        burger++;
        notifyAll(); // Fortæller den anden tråd at burger antallet er ændret
        System.out.println("Burger = " + burger + " fra tråd: " + Thread.currentThread().getName());

    }

    public synchronized void decrement(){

        while (burger < 1){
            try {
                wait(); // venter og lytter til notify fra andre tråde
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        burger--;
        notifyAll(); // Fortæller den anden tråd at burger antallet er ændret
        System.out.println("Burger = " + burger + " fra tråd: " + Thread.currentThread().getName());

    }

}
