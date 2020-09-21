public class Slide {

    //Hvor mange burger der er i
    private int counter = 0;


    public synchronized void increment(){
        while (counter > 7){
            try {
                wait(); // Lytter til notify() fra andre tråde
            }catch (Exception e){

            }
        }

        // increment:
        counter = counter + 1;
        notifyAll(); // fortæl den anden tråd, at nu er counter ændret
        System.out.println("Slide " +counter + " fra tråd: " + Thread.currentThread().getName());

    }

    public synchronized void decrement(){

        while (counter< 1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        counter = counter -1;
        notifyAll();
        System.out.println("Slide " +counter + " fra tråd: " + Thread.currentThread().getName());

    }

    public int getCounter() {
        return counter;
    }
}
