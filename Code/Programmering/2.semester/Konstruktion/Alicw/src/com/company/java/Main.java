package com.company.java;

public class Main {

    public static void main(String[] args) {

        Alice alice = new Alice();

        String text = alice.getText();

        System.out.println(text);

        int a = alice.getTotalLetters(text);

        System.out.println(a);

       int words =  alice.countWords(text);

        System.out.println(words);

        Test1 test1 = new Test1();

        int val = test1.getNumberByName("Aliza");

        System.out.println(val);

    }
}
