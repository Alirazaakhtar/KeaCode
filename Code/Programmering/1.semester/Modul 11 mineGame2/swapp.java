import java.util.Arrays; 

public class swapp{


   public static void main(String[]args){
   
   
      int[] tal = {12,67,45};
      int[] tal1 = {32,43,65};
   
   //Hvis vi gerne vil bytte tallene 1 og 2 i en array
      swap(tal, 1, 2);
      swapAll(tal,tal1);
   
      System.out.println(Arrays.toString(tal));
     
       
        swapAll(tal,tal1);
        
        System.out.println(Arrays.toString(tal));
       System.out.println(Arrays.toString(tal1));
   }

   public static void swap(int[]x, int tal1, int tal2){
   
   
   // vi laver en variable som gemmer x[1]
      int tal = x[tal1];
   
   //VI overrider x[1] til x[2]
      x[tal1] = x[tal2];
   
   // x[1] = x[2]
      x[tal2] = tal; 
   
   
   }
   
   public static void swapAll(int [] array1, int [] array2){
   
      int [] temp = array1;
      array1 = array2;
      array2 = temp; 
      
      
      
   
   
   }



}