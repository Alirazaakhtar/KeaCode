package Strategy;

import Strategy.fly.IFlyBehavior;
import Strategy.quack.IQuackBehavior;

public class Duck {

    private IFlyBehavior fb;
    private IQuackBehavior qb;

    public Duck(IFlyBehavior fb, IQuackBehavior qb) {
        this.fb = fb;
        this.qb = qb;
    }


    public String fly(){
        return this.fb.fly();
    }

    public String quack(){
        return this.qb.quack();
    }
}
