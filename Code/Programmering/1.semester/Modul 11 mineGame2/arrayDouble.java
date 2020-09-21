import java.util.*;
public class arrayDouble{


   public static void main(String[]args){
   
      int arrayAge[][] = new int[2][];
   
      showAge(arrayAge);
   
   
   }
   
   
   public static void showAge(int age[][]){
   
      Random random = new Random();
      
       
   
   
   
      for(int i = 0; i<age.length;i++){
      
      
      
         for(int j = 0; j<age[i].length; j++){
         
                     
          age[i][j] = random.nextInt(10)+1;  
         
            System.out.print(age[i][j] + "\t");
         
         
         }
         System.out.println();
      
      }
      
      
     
   
   }



}


