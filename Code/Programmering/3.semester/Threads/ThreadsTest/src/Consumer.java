public class Consumer implements Runnable {

    private Slide slide;
    private int counter;

    public Consumer(Slide slide) {
        this.slide = slide;
    }

    @Override
    public void run() {

        while (counter < 10) {
            slide.decrement();
            counter++;

//            int random = (int) (Math.random() * 1000);
//            try {
//                Thread.sleep(random);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//
//            }
        }
    }

}

