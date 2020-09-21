import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Øvelse{


   public static void main(String [] args){
   
      Cars bmw = new Bmw("Bmw", 2019);
      Cars bmwA = new SerieA("bmwA", 2020);
     
      ArrayList<Cars> carsList = new ArrayList<Cars>();
     
     
      carsList.add(bmw);
      carsList.add(bmwA);
      
      
      
      
   }

}