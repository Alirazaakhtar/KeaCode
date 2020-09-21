import java.util.*;
import java.io.*;

public class read{


   private Scanner x;

   public void openFile(){
   
      try{
      
      String event1 = "Chinses.txt";
         x = new Scanner(new File(event1));
      
      
      }
      
      catch(Exception e){
      
         System.out.println("Could not find file");
      
      
      }
   
   
   
   }

   public void readFile(){
   
   
      while(x.hasNext()){
      
      //String z = x.next();
      //String b = x.next();
      //String c = x.next();
      
         System.out.print(x.next() + " ");
      
      }
   
   
   
   }

   public void closeFile(){
   
   
      x.close();
   
   
   }



}