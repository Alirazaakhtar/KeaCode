import java.util.*;
import java.io.*;

public class FileHolder{


   public void createFile(String name){
   
      try{
         Formatter create = new Formatter(new File(name + ".txt"));
         System.out.println("File created");
      }
      catch(FileNotFoundException e){
      
         System.out.println("File not created");
      }
   
   }


   public void writeFile(String name){
      PrintStream x;
      Scanner scan  = new Scanner(System.in);
      String input;
     
      do{
      
         System.out.println("Type a number to the file: To close file type [end] ");
      
      
         try{
         
            do{
               PrintStream createFile = new PrintStream(new FileOutputStream(name + ".txt", true));
            
            //Write to file
               input = scan.nextLine();
            
               if(!input.equals("end")){
                  createFile.println(input);
               }
            }while(!input.equals("end"));
         
           
         }
         catch (Exception e){
         
            System.out.println("Try Again with a double");
         } 
         
         System.out.print("Do you want to write to file again[Y] or quit[N]");
         input = scan.nextLine();
      }while(!input.equals("n"));  
     
            
   }
   
   
   public void printFile(String name){
   
      try{
      
         Scanner scan = new Scanner(new File(name + ".txt"));
         
         for(String line; scan.hasNextLine() && (line = scan.nextLine()) !=null; ){
         
            System.out.println(line);
         
         }
         
      }
      catch(FileNotFoundException e){
      
         System.out.println("File not found");
      
      }
   }
   
   public void deleteFile(String name){
   
      File file = new File(name + ".txt");
   
      file.delete();
      System.out.println("File deleted");
   
   }
   

   ArrayList<Double> list = new ArrayList<Double>();
   
   public void readFileArray(String name){
        
      try{
         
         
         
         Scanner s = new Scanner(new File(name+".txt"));
        
         double sum = 0;
         int total = 0;
      
         while (s.hasNext()){
            list.add(s.nextDouble());
            sum = sum + s.nextDouble();
            total++;
         
            s.nextLine(); // Eat the next line
            // Remove the conditional if statement to eat the new line
         }
         System.out.println(list);
         System.out.println("The average in this arrayList is: " + sum/total);
      
         s.close();
           
      
              
      
      }
      catch(Exception e){
      
      
         System.out.println("Try Again");
      
      }
   
   }
   
  




}