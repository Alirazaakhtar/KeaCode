package com.company.java;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Hunter hunter = new Hunter("Hunter");
        Tiger tiger = new Tiger("Tiger");
        Menl menu = new Menl();

        menu.menuInfo();
        System.out.println(tiger);

// Find hunter

        for (int x = 1; x < 100; x++) {

            for (int y = 1; y < 100; y++) {

                if (hunter.isHunterHere(x, y)) {
                    System.out.println("Hunter is on position (" + x + ", " + y + ")");
                    break;
                }

            }
        }

        // Hunt the tiger

        for (int x = 1; x < 100; x++) {

            for (int y = 1; y < 100; y++) {

                if (tiger.isTigerHere(x, y)) {
                    System.out.println("Tiger is on position (" + x + ", " + y + ")");

                    if (hunter.isHunterInRange(x, y)) {
                        System.out.println("The hunter has shot the tiger...");
                    }
                }


            }


        }

    }
}

