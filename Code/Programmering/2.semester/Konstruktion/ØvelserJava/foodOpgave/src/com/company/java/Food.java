package com.company.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Food extends Vare {

    private boolean okologisk;

    private ArrayList<String> ingrediensList = new ArrayList<String>();

    FoodInfo createInfo = new FoodInfo();
    Scanner scan;

    public Food(String name, double price, boolean okologisk, String realName) {

        super(name, price);
        this.okologisk = okologisk;

        createInfo.setRealName(realName);
    }

    public void addIngrediens() {

        scan = new Scanner(System.in);

        while (true) {
            System.out.print("Add ingrediens (press 'e' to end): ");
            String input = scan.next();
            if (input.equals("e")) {
                break;
            } else
                ingrediensList.add(input);


        }
    }

    public boolean indeholderIngrediensen(String ingrediens) {


        if (ingrediensList.contains(ingrediens)) {
            return true;
        }
        return false;
    }

    public void getSorteretIngrediensListe() {

        ingrediensList.sort(Comparator.comparing(String::toString));

        for (String x : ingrediensList) {
            System.out.println(x);
        }

    }


}
