import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanInput = new Scanner(System.in);

        try {
            System.out.print("Skriv første tal: ");
            int tal1 = scanInput.nextInt();

            System.out.print("skriv andet tal: ");
            int tal2 = scanInput.nextInt();

            double result = (double) tal1 / tal2;
            System.out.println("Resultat: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        // Hvis man divider 1 med 0
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


    }

}
