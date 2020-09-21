import java.util.Arrays;
public class merge{


   public static void main(String [] args){
   
   
      int [] tal1 = {23,34,53,32};
   
   
      int [] tal2 = {3,2,23,57};
      
      int [] tal3 = {3,2,2,34};
   
      int [] alle = merge(tal1, tal2);
      
      int [] alle2 = merge(merge(tal2, tal3),tal1);
   
   
      System.out.println(Arrays.toString(alle2));
   }


   public static int [] merge(int[]x, int[]y){
   
      int [] all = new int[x.length + y.length];
     
      
      for(int i = 0; i<x.length;i++){
      
         all[i] = x[i];
         }
      
      for(int i = 0; i<y.length;i++){
      
         all[y.length + i] = y[i];
      
      }
   
      
      
      return all;
   
   }


}