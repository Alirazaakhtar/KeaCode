package test;

public class testthread {


    private int balance = 0;

    public static void main(String[] args) {

        testthread h = new testthread();

        h.bad();

    }

    public void bad(){


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 100000; i++) {
                    add();
                }

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    subtract();
                }
            }
        });

        t1.start();
        t2.start();



        try{
            t1.join(); // venter på thread dør
            t2.join();

        }catch (Exception e){

        }

        System.out.println(balance);

    }

    // hvis man bruger sync, så undgår man at flere metoder intergere med det samme data
    public synchronized void add() {
        balance++;
    }

    public synchronized void subtract() {
        balance--;
    }
}
