import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Alice {

    public static void main(String[] args) throws IOException {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Write to file");
        String fileContent = userInput.nextLine();

        FileWriter fileWriter = new FileWriter("R/Alice.txt");
        fileWriter.write(fileContent);
        fileWriter.close();

    }
}
