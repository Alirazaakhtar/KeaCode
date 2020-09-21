public class BurgerSlide {

    private int counter;

    public synchronized void increment(){

        while (counter > 7){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

            counter++;
            notifyAll();
            System.out.println("Total Burgers made: " + counter + " Thread name: " + Thread.currentThread().getName());


    }


    public synchronized void decrement(){
        while (counter < 1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

            counter--;
            notifyAll();
            System.out.println("Total Burgers made: " + counter + " Thread name: " + Thread.currentThread().getName());

    }

}
