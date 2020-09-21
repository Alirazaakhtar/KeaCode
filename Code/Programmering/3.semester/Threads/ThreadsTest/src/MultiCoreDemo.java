import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultiCoreDemo {
    // Opgaven er at fylde en liste med tilfældige ord
    // Check om det går hurtigere, hvis der er flere tråde.
    public static void main(String[] args) {
        new MultiCoreDemo();
    }
    public MultiCoreDemo() {
        for (int i = 0; i <2; i++) {
            new Worker(System.currentTimeMillis()).start();
        }
    }
    class Worker extends Thread {
        long startTime;
        public Worker(long s){
            startTime = s;
        }
        @Override
        public void run() {
            super.run();
            List<String> list = new ArrayList<>();
            Random random = new Random();
            int c = 0;
            while (c < 10000000){
                list.add(random.nextInt(1000000) + "");
                c++;
            }
            long diff = System.currentTimeMillis() - startTime;
            System.out.println("Done " + Thread.currentThread().getName() + " t: " +diff);
        }
    }
}
