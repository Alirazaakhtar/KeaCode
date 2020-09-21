public class BurgerDeliveryMan implements Runnable {

    private BurgerSlide burgerSlide;
    private int counter = 0;

    public BurgerDeliveryMan(BurgerSlide burgerSlide) {
        this.burgerSlide = burgerSlide;
    }

    @Override
    public void run() {

        while (counter < 10){

            burgerSlide.decrement();
            counter++;
        }
    }
}
