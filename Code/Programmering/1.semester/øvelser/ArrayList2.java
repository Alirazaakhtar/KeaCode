import java.util.*;
public class ArrayList2{

   Scanner reader = new Scanner(System.in);

   ArrayList<Integer> arrayTal = new ArrayList<Integer>();
   
   
   
   public void input(){
   
      int in = reader.nextInt();
      while(in != 0){
         arrayTal.add(in);
         in = reader.nextInt();
      
      }
   
   }
   
   public void remove(){
   
      int delete = reader.nextInt();
      for(int i = 0; i<arrayTal.size(); i++){
      
         if(arrayTal.get(i) == delete){
         
            arrayTal.remove(i);
         break;
         }
      }
   
   } 
   
   public void printArray(){
   
      for(int i: arrayTal){
         System.out.println(i);
      }
   }

}