public class Car implements Runnable {

    private int distance = 0;
    private String name = "empty";

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        while (distance < 10){
            distance++;
            System.out.println(name + ": ");
            for (int i = 0; i < distance; i++) {
                System.out.print(".");

            }
            System.out.println();

            int random = (int) (Math.random() * 1000);

            //Sleep random seconds
            try {
                Thread.sleep(random);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
