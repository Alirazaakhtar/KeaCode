import java.util.Arrays;
public class arrayAp{


   public static void main(String[]args){
   
      arrayApp newData = new arrayApp();
      
      
      int [][] array1 = {{1,2,3,4,5},{9,8,7,6,5}};
      int [][] array2 = {{23,24,25}, {76,54,33,2}, {43,32,87,54,4}};
      
      
      display(array1);
      
      display(array2);
      
      SetAlder(21);
      
      Arrays.binarySearch(array1, value);
      
   }



   public static void display(int x[][]){
   
   // x.length = længden af den første array, altså kun den første squr []
      for(int rakke = 0; rakke<x.length; rakke++){
      
      
      //x[rakke].length fortæller loop hvor mange kasser der er i den første række
         for(int kasse = 0; kasse<x[rakke].length; kasse++){
         
         System.out.print(x[rakke][kasse] + "\t");
         
         }
      System.out.println();
      }
   
   
   
   }
   
   
   public static void SetAlder(int x){
   

   
   
   System.out.println("Alder: " + x);
   
   
   }

}