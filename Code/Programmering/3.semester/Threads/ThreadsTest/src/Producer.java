public class Producer implements Runnable {

    private Slide slide;
    private int counter = 0;

    public Producer(Slide slide) {
        this.slide = slide;
    }

    @Override
    public void run() {

        while (counter < 10) {

            slide.increment();
            counter++;

//            int random = (int ) (Math.random() * 100);
//            try {
//                Thread.sleep(random);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

        }

    }
}
