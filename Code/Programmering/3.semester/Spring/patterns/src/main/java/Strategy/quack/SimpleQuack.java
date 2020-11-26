package Strategy.quack;

import Strategy.quack.IQuackBehavior;

public class SimpleQuack implements IQuackBehavior {


    @Override
    public String quack() {
        return "Simple quack";
    }
}
