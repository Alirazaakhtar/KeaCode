package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AliceCounter {

    public String readFile(){

        File file = new File("src/Aliceinwonderland.txt");
        String test = "";

        try {
            Scanner scanner = new Scanner(file);


            while (scanner.hasNextLine()){
                test = test + "\n" + scanner.nextLine();

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return test;
    }


    public int countLetters(String string){
        int count = 0;
        int lettercount = 0;
        string = string.toLowerCase();

        while (count < string.length()){
            char c = string.charAt(count);
            if(c >= 97 && c<= 123 || c>=48 && c<=57){
                lettercount++;
            }
            count++;
        }
        return lettercount;
    }

    public static int countWords(String s){

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
