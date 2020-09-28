import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReader {

    public static void main(String[] args) {

        ArrayList<String> title = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();


        try {
            Scanner scanner = new Scanner(new File("info.csv"));

            String[] headers = scanner.nextLine().split(",");

            while (scanner.hasNextLine()){
                String[] lineArr = scanner.nextLine().split(",");
                for (int i = 0; i <lineArr.length ; i++) {
                    System.out.print(headers[i] + " : " + lineArr[i] + " ");

                }
                System.out.println();
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}
