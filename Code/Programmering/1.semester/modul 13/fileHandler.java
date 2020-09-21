import java.io.*;
public class fileHandler{

   File file;
   
   


   public void deleteFile(String name){
   
      file = new File(name);
   
      file.delete();
   
   }
   
   public void existsFile(String name){
   
      file = new File(name);
   
      file.exists();
   
   }



}