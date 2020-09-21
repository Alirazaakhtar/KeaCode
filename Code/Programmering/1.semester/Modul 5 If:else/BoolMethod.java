import java.util.Random;
public class BoolMethod{
   
   public static void main(String[]args){
   
Random terning = new Random();
   
   int x = 5; 
   int y = 4;
   int z = 6;
   
   

   for(int i = 1; i<=1; i++){
   
   x = terning.nextInt(6+1);
   System.out.println(x);
   }
      if(x>y && x>z){
      
         System.out.println("X er størst");
      }
      else if (y>x && y>z){
         System.out.println("Y er størst");
      
      }else if (z>y && z>x){
         System.out.println("Z er størst");
      }else
      System.out.println("2 eller alle er ens");
   
   }


}