import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CSVWriter {

    public static void main(String[] args) {
        String csv = "Navn, Efternavn, Adresse\nAli Raza, Akhtar, Ågården";

        try {
           FileWriter fileWriter = new FileWriter("info.csv");

           fileWriter.write(csv);

           fileWriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
