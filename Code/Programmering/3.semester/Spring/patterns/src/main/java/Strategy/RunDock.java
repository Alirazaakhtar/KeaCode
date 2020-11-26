package Strategy;

import Strategy.fly.IFlyBehavior;
import Strategy.fly.JetFlying;
import Strategy.fly.SimpleFlying;
import Strategy.quack.SimpleQuack;

public class RunDock {

    public static void main(String[] args) {

        Duck duck1 = new Duck(new SimpleFlying(), new SimpleQuack());

        duck1.fly();
        duck1.quack();

        System.out.println(duck1.fly());
        System.out.println(duck1.quack());
    }

}
