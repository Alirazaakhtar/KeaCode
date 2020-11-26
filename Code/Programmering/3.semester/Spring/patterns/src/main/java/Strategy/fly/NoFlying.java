package Strategy.fly;

public class NoFlying implements IFlyBehavior {
    @Override
    public String fly() {
        return "No Flying";
    }
}
