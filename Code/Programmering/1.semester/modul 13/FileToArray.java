import java.util.*;
import java.io.*;
public class FileToArray {


   public static void main(String[]args)throws java.io.IOException{
   
      Scanner s = new Scanner(new File("Bob.txt"));
      ArrayList<Integer> list = new ArrayList<Integer>();
      while (s.hasNext()){
         list.add(s.nextInt());
         s.nextLine(); // Eat the next line
            // Remove the conditional if statement to eat the new line
      }
      System.out.println(list);
      s.close();
           
   }

}