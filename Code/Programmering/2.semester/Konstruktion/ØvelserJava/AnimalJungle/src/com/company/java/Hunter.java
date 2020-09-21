package com.company.java;

import java.util.Random;
import java.util.Scanner;

public class Hunter {

    private String name;
    private int x;
    private int y;

    Scanner scan = new Scanner(System.in);
    Random random = new Random();

    // Opretter en konstruktør
    public Hunter(String name) {
        this.name = name;

        x = random.nextInt(100) + 1;
        y = random.nextInt(100) + 1;

    }

    public boolean isHunterInRange(int x, int y) {
        return (x < this.x + 16 && x > this.x - 16) && (y < this.x + 16 && x > this.y - 16);
    }

    public boolean isHunterHere(int x, int y) {
        return x == this.x && y == this.y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveHunter() {

        String input = scan.next();

        //hvis der bliver trykker w og y er mindre en 10, så incrementer y med  1
        if (input.equals("w") && y < 10) {
            y++;
        }
        if (input.equals("s") && y > 0) {
            y--;
        }
        if (input.equals("d") && x < 10) {
            x++;
        }
        if (input.equals("a") && x > 0) {
            x--;
        }
    }

    public void showHunter() {

        System.out.println(name + " is on position (" + x + ", " + y + ")");

    }
}
