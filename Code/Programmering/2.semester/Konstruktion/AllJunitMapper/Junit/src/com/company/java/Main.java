package com.company.java;

import java.util.InputMismatchException;

public class Main {

    public int sum(int a, int b) {
        if (a > 1000 || b > 1000) {
            throw new InputMismatchException("wrong number");
        }
        return a + b;
    }

}
