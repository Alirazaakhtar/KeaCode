public class BurgerMaker implements Runnable {

    private BurgerSlide burgerSlide;

    private int counter = 0;

    public BurgerMaker(BurgerSlide burgerSlide) {
        this.burgerSlide = burgerSlide;
    }

    @Override
    public void run() {

        while (counter < 10){

            burgerSlide.increment();

            counter++;
        }

    }
}
