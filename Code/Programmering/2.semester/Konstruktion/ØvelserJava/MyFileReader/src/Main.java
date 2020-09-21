import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter file name");
        String filePath = input.next();
        File fileToRead = new File(filePath);
        ArrayList<String> list = new ArrayList<String>();

        try {

            Scanner scanText = new Scanner(fileToRead);
            while (scanText.hasNextLine()) {
                list.add(scanText.nextLine());
            }


        } catch (FileNotFoundException e) {
            System.out.println("Could not find file ");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception");
        }

        System.out.println(list);

    }
}
