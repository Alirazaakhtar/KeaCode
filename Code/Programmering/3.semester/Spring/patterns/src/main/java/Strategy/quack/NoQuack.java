package Strategy.quack;

public class NoQuack implements IQuackBehavior {

    @Override
    public String quack() {
        return "No quack";
    }
}
