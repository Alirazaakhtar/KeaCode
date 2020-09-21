//import java.io.*; 
//import java.lang.*;
import java.util.*;

//format 
//close


public class CreateFile2{

   private Formatter x; 


   public void openFile(String name){
   
      try{
      
      
         x = new Formatter(name + ".txt");
      
         System.out.println("Created");
      
      }
      catch(Exception e){
      
         System.out.println("Error"); 
      
      }
   
   }


   public void writeFile(String text){
   
      x.format(text);
   
   
   }


   public void closeFile(){
   
      x.close();
   
   }




}