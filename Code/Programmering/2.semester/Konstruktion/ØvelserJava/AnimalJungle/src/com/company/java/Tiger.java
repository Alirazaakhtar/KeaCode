package com.company.java;

import java.util.Random;

public class Tiger extends Animal {


    Random random = new Random();

    public Tiger(String name) {
        super(name);

    }

    public void gotCaught() {
        System.out.println(super.getName() + " got caught");
    }

    public boolean isTigerHere(int x, int y) {
        return getY() == y && getX() == x;
    }

}
