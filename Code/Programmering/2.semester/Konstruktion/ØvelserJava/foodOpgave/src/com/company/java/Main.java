package com.company.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Food food;
        ArrayList<Food> foodList = new ArrayList<Food>();
        ArrayList<String> foodNames = new ArrayList<String>();

        FoodList foodList1 = new FoodList();
        Password login = new Password();


        while (true) {


            try {
                System.out.println("type User login");
                System.out.print("type user name: ");
                String user = scan.next();
                System.out.print("Type password: ");
                String pass = scan.next();
                // (user.equals(login.getUser()) && (pass.equals(login.getPass())))
                if (login.login(user, pass)) {

                    System.out.println("\nWelcome to FoodStore");
                    System.out.println("1: Create a food");
                    System.out.println("2: Check if a specific ingrediens is in the food ");
                    System.out.println("3: Get Sorteret Ingrediens list");
                    System.out.println("4: Show all food");
                    System.out.println("0: EXIT");

                    scan = new Scanner(System.in);

                    System.out.print("please type a number: ");
                    int selectedNum = scan.nextInt();

                    if (selectedNum == 1) {

                        System.out.print("Type market name of food product?: ");
                        String foodName = scan.next();
                        foodNames.add(foodName);

                        System.out.print("Type true or false if the product is okologisk?: ");
                        boolean isOkologisk = scan.nextBoolean();

                        System.out.print("What is the real name of the product?: ");
                        String realName = scan.next();

                        System.out.print("What is the price?: ");
                        double price = scan.nextDouble();

                        //Add to database
                        foodList1.addFoodToDatabase(foodName, price, isOkologisk, realName);

                        foodList.add(food = new Food(foodName, price, isOkologisk, realName));

                        System.out.print("Type all the ingrediens in the product one by one: ");
                        food.addIngrediens();

                        System.out.println("Food created...");
                    }

                    if (selectedNum == 2) {
                        System.out.println("What food you want to see a ingrediens in?: ");

                        for (int i = 0; i < foodNames.size(); i++) {
                            System.out.println(i + ": " + foodNames.get(i));
                        }
                        scan = new Scanner(System.in);
                        System.out.print("please choose a food number?: ");
                        int foodNum = scan.nextInt();

                        System.out.print("Please type the ingrediens you want to chech?: ");
                        String chechIngrediens = scan.next();
                        System.out.println(foodList.get(foodNum).indeholderIngrediensen(chechIngrediens));

                    }
                    if (selectedNum == 3) {

                        System.out.println("What food you want to sort ingrediens in?: ");

                        for (int i = 0; i < foodNames.size(); i++) {
                            System.out.println((i + 1) + ": " + foodNames.get(i));
                        }
                        scan = new Scanner(System.in);
                        System.out.print("please choose a food number?: ");
                        int foodNum = scan.nextInt() - 1;

                        foodList.get(foodNum).getSorteretIngrediensListe();
                    }

                    if (selectedNum == 4) {
                        System.out.println();
                        foodList1.showAllFoodFromDatabase();
                    }

                    if (selectedNum == 0) {
                        break;
                    }

                    if (selectedNum > 3) {
                        System.out.println("choose a number from the menu");
                    }

                }

            } catch (Exception e) {
                System.out.println("Wrong input. try again");
            }
        }
    }
}
