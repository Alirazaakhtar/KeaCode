import java.io.*;
import java.util.*;
public class FileHandler{



   public void addContact(MyContact object){
   
      try{
      
         PrintStream newFile = new PrintStream(new FileOutputStream("Contact.txt", true)); 
      //write to file by objects
         newFile.println(object);
      
      
      
      
      
      }
      catch(Exception e){
      
         System.out.println("File not created");
      
      }
   
   
   }
   
   
   public void printFile(){
   
      try{
      
         Scanner scan = new Scanner(new File("Contact.txt"));
         
         for(String line; scan.hasNextLine() && (line = scan.nextLine()) !=null; ){
         
            System.out.println(line);
         
         }
         
      }
      catch(FileNotFoundException e){
      
         System.out.println("File not found");
      
      }
   }
   
   
   public void read(){
         }






}