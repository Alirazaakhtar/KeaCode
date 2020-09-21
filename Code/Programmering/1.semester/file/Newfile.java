import java.util.*;
public class Newfile{


   public static void main(String[]args){
   
      Formatter x;
      Scanner scan  = new Scanner(System.in);
   
      try{
      
         System.out.print("Create name of the file you want to create?: ");
      
         String name = scan.next();
      
         x = new Formatter(name + ".txt");
      
         System.out.println("file created\n");
         
         Scanner readFile()
      
      }
      catch(Exception e){
      
      
         System.out.println("File not found");
      
      }
   
   
   }




}