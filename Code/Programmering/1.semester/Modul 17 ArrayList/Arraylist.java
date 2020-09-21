import java.util.*;
public class Arraylist{


   public static void main(String[]args){
   
      ArrayList<Integer> array = new ArrayList<Integer>();
      ArrayList<Integer> array1 = new ArrayList<Integer>();
   
      Random r = new Random();
      
      int random = r.nextInt(100+ 1);
      
      array.add(random);
      array.add(random);
   
   
      array.add(10);
      for(int num : array){
      
         System.out.println(num);
      
      
      }
   
      System.out.println(array);
   
   
   
   
   
   
   }


}