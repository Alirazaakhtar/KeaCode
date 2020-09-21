import java.util.Arrays;
public class merge3 {

   public static void main(String [] args){
   
   
      int [] tal1 = {23,34,53,32};
   
   
      int [] tal2 = {3,2,23,57};
   
      int [] tal3 ={23,54,34,32} ;
      
      int [] all = merge2(tal1, tal2 , tal3);
   
   
      System.out.println(Arrays.toString(all));

   
   
   
   }

   public static int [] merge2(int[]array1, int [] array2, int [] array3){
   
      int [] array4 = new int[array1.length + array2.length + array3.length];
   
      for(int i = 0; i<array1.length; i++){
      
         array4[i] = array1[i];
      
      }
      
      for(int i = 0; i<array2.length; i++){
      //Start fra at tælle fra array1
         array4[array1.length + i] = array2[i];
      
      }
      
      for(int i = 0; i<array3.length; i++){
      //Start fra at tælle fra array1
         array4[array1.length + array2.length + i] = array3[i];
      
      }


   
   
   
      return array4;
   
   
   }

}