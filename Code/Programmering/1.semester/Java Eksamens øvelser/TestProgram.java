import java.util.ArrayList;

public class TestProgram{

   public static void main(String[]args){
   
      ArrayList<Integer> a = new ArrayList<Integer>();
   
      a.add(5);
      a.add(66);
      a.add(12);
      a.add(87);
      a.add(66);
      a.add(87);
      a.add(89);
   
   
      for(int i = 0; i < a.size(); i++){
      
         if(a.get(i) == 87){
            a.remove(i);
         }
      
      }
      
      for(int i = 0; i < a.size(); i++){
      
      System.out.println(a.get(i));
      
      
      }
   
   
   
   
   }



}