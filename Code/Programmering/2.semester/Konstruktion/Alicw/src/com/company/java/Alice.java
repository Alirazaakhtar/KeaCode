package com.company.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Alice {

    public String getText(){

        String text = "";
        File file = null;

        try {
            file = new File("src/Aliceinwonderland.txt");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                text = text + "\n" + scanner.nextLine();
            }





        } catch (Exception e) {
            e.printStackTrace();
        }

        return text;


    }


    public int getTotalLetters(String str){

        int count = 0;
        int lettercount = 0;
        str = str.toLowerCase();

        while (count < str.length()){
            char c = str.charAt(count);
            if(c >=97 && c<=123 || c>=48 && c<=57){
                lettercount++;
            }
            count++;
        }
return lettercount;
    }

    public int countWords(String s){

        int wordCount = 0;

        boolean word = false;
        int endOfLine = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            // if the char is a letter, word = true.
            if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
                word = true;
                // if char isn't a letter and there have been letters before,
                // counter goes up.
            } else if (!Character.isLetter(s.charAt(i)) && word) {
                wordCount++;
                word = false;
                // last word of String; if it doesn't end with a non letter, it
                // wouldn't count without this.
            } else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }

}
