import java.time.LocalTime;

import java.util.Random;

public class loopp{

   public static void main(String []args){
   
   
      LocalTime date = LocalTime.now();
   
      System.out.println(date);
   /*
      for(int i = 1; i<=10; i+=1){
         for (int j = 1; j <=10; j++){
      System.out.print(i * j + "\t");
      }
         System.out.print("\n");
      }
      */
      for (int i = 1; i<=10; i++){
      
      
         for(int j = 1; j<=10; j++){
            System.out.print(i*j+"\t" );
         }
         
         
      System.out.println();
      }
   
   
   
   
   }
}