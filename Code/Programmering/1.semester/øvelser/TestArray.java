import java.util.Random;
public class TestArray{


   
   public static void main(String[]args){
      int kasse[] = {2,3,4,5,6};
   
      setTal(kasse);
   
      for(int y =kasse;)
         System.out.println(y);
   
   }


   public static void setTal(int x[]){
   
      for(int i = 0; i <x.length; i++){
         x[i]+=5;
      }
   }





/*

   public static void main(String[]args){
   
   
   
   
      String[] breakfast = new String[3];
   
      breakfast[0] = "vand";
      breakfast[1] = "banan";
      breakfast[2] = "sucuk";
   
            
   
   for(int i = 0; i<breakfast.length; i++){
   System.out.println(breakfast[i]);

   }
   
   
   
      Random r = new Random();
   
      int array [] = new int[6];
   
   
      for(int i = 0; i<10; i++){
      
         array[r.nextInt(6)]+=10;
      
      }
   
      for(int j = 0; j<array.length; j++){
         System.out.println(j + "\t" + array[j]);
      }
   }

*/

}