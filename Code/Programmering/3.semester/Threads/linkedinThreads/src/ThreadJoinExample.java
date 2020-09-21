public class ThreadJoinExample {

    static double a = 10;
    static double b;
    static int counter = 1;


    public static int getID() {
        return counter++;
    }

    public static void main(String[] args) {
        CountDown CD = new CountDown();

        Runnable c1 = ()-> {
            synchronized (CD){
                CD.printCount();
            }

        };


        Thread ct1 = new Thread(c1);
        Thread ct2 = new Thread(c1);
        ct1.start();
        ct2.start();




//
//        Runnable r = () -> {
//            System.out.println("ID value: " + getID() + " t: " + Thread.currentThread().getName());
//        };
//
//
//        Thread thread1 = new Thread(r);
//        thread1.start();
//        Thread thread2 = new Thread(r);
//        thread2.start();


//        Her laver vi to Threads, hvor den ene skal dividere den ene med 2 og den anden
//      skal ændre a. Problemet her er at hvis if statement er true, så vil thread falde i svøn, hvor a værdien
//        bliver ændre til 12 i den anden threads, så bliver a / 2 i den første thread, hvilket er en logisk fejl
//        Runnable r1 = ()-> {
//
//            if(a == 10){
//                try {
//                    Thread.sleep(0);
//                    b = a/2;
//                    System.out.println(Thread.currentThread().getName() + ": " + b);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//
//
//        Runnable r2 = ()->{
//            a = 12;
//        };
//
//        Thread t1 = new Thread(r1);
//        Thread t2 = new Thread(r2);
//        t1.start();
//        t2.start();


//        TestJoinClass t1 = new TestJoinClass("t1");
//        TestJoinClass t2 = new TestJoinClass("t2");
//        TestJoinClass t3 = new TestJoinClass("t3");
//
//        t1.start();
//
//        t2.start();
//        try {
//            t1.join();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//
//        t3.start();


    }


}
