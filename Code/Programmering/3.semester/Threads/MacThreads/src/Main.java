public class Main {

    public static void main(String[] args) {


        BurgerSlide burgerSlide = new BurgerSlide();

        BurgerMaker burgerMaker = new BurgerMaker(burgerSlide);
        BurgerDeliveryMan burgerDeliveryMan = new BurgerDeliveryMan(burgerSlide);

        Thread thread1 = new Thread(burgerMaker);
        Thread thread2 = new Thread(burgerDeliveryMan);
        thread1.start();
        thread2.start();


    }
}
