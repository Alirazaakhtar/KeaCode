import java.util.*;
import java.io.*;
public class FileToArray {


   public static void main(String[]args)throws java.io.IOException{
   
      Scanner s = new Scanner(new File("Bob.txt"));
      ArrayList<Double> list = new ArrayList<Double>();
      double sum = 0;
      int total = 0;
      
      while (s.hasNext()){
      
         list.add(s.nextDouble());
         sum = sum + s.nextDouble();
         total++;
         s.nextLine(); // Eat the next line
            // Remove the conditional if statement to eat the new line
      }
      System.out.println(list);
      System.out.println("The average in this arrayList is: " + sum/total);
      s.close();
           
   }

}