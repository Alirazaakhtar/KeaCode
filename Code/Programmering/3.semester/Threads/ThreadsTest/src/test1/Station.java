package test1;

public class Station {


    public static void main(String[] args) {

        Burger burger = new Burger();

        Medarbejder medarbejder = new Medarbejder(burger);
        Kunde kunde = new Kunde(burger);

        Thread t1 = new Thread(medarbejder);
        Thread t2 = new Thread(kunde);

        t1.start();
        t2.start();

    }
}
