package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AliceCounter {
    // læser txt filen fra disk
    public String readFile(){
        File file = new File("alice.txt");
        String string = "";
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                string = string + scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return string;// returnerer hele teksten
    }

    public int countLetters(String string){
        int count = 0;
        int letterCount = 0;
        string = string.toLowerCase();
        while (count < string.length()){
            // check om character is a-z or 0-9
            char c = string.charAt(count);
            if (c >= 97 && c <= 123 || c >= 48 && c<= 57){ // henter bogstaver a-z og tal 0-9
                letterCount++;
            }
            count ++;
        }
        return letterCount;
    }
}
