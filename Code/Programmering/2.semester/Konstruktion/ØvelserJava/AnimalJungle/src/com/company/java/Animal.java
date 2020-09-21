package com.company.java;

import java.util.Random;

public abstract class Animal {

    private String name;
    private int x;
    private int y;

    Random random = new Random();

    public Animal(String name) {
        this.name = name;

        x = random.nextInt(100) + 1;
        y = random.nextInt(100) + 1;

    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
