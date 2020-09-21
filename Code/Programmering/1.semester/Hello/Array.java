import java.util.Random; 

public class Array{


   public static void main (String[]args){
   
      Random r = new Random();
      
      int array[] = new int[7];
      
      
      
      
      // hver gang for loop kører, 
      //så bliver der randomly valgt en varible som er i rum 1 til 6,
      // i det rum der bliver valgt, så vokser den med 1.
      for(int i = 0; i<10; i++){
      
         ++array[r.nextInt(6)+1];
      
      }
      
      // viser antal rum i arrayListen
      for(int x = 1; x<array.length;x++){
      
      System.out.println(x + "\t" + array[x]);
      
      }
   /*   
   
      int terning[] = new int[7];
      
      
   
   for(int roll = 1; roll<10; roll++){
   ++terning[r.nextInt(6)+1];
   }
   
   System.out.println("face\tTerning");
   
   for(int face = 1; face<terning.length; face++){
   System.out.println(face + "\t" + terning[face]);
   }
   */
   
   
   
   }
}