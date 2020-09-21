public class Main {

    public static void main(String[] args) {

        Slide slide = new Slide();
        Consumer consumer = new Consumer(slide);
        Producer producer = new Producer(slide);
        Thread consumerThread = new Thread(consumer, "Ali");
        Thread producerThread = new Thread(producer);
        consumerThread.start();
        producerThread.start();




        /*
        Slide resource = new Slide();
        Worker w1 = new Worker(resource);
        Worker w2 = new Worker(resource);
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);
        t1.start();
        t2.start();
*/

        /*
        Car aston = new Car("Astom Martin");
        Car porsche = new Car("Porsche");

        Thread t1 = new Thread(aston);
        Thread t2 = new Thread(porsche);

        t1.start();
        t2.start();

*/
    }


}
