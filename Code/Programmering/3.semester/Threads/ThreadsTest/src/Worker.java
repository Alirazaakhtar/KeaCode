public class Worker implements Runnable {

    private Slide resource;
    private int repeats = 0;

    public Worker(Slide resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        while (repeats < 100000) {
            resource.increment();
            repeats++;

        }
        System.out.println("Done resource: " + resource.getCounter() + " name: " + Thread.currentThread().getName());

    }
}
