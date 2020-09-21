public class TestJoinClass extends Thread {


    public TestJoinClass(String name) {
        super(name);
    }


    @Override
    public void run() {

        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " i = " +i);
        }
    }
}
