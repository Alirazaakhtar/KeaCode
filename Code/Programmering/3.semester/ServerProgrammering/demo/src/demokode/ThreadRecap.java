package demokode;

public class ThreadRecap {


    public static void main(String[] args) {

        new ThreadRecap();

    }

    public  ThreadRecap(){
        Thread thread = new Thread(new Worker());
        thread.start();
    }

    class Worker implements Runnable{


        @Override
        public void run() {
            System.out.println("Køre i separat tråd");
        }
    }
}
