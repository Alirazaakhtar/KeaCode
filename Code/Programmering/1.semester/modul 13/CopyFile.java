import java.io.*;
import java.util.*;

public class CopyFile{


   public static void main(String [] args){
      Scanner input = new Scanner(System.in);
      String in;
   
      
      try{
         System.out.print("Indtast en existerende fil eller opret en fil ved navn: ");
         String nameFile = input.nextLine();
         
         System.out.println("Skriv i filen[n = exit]: ");
         do{
            PrintStream output = new PrintStream(new FileOutputStream(nameFile + ".txt", true));
            in = input.nextLine();
            
            if(!in.equals("n")){
            
            //det her ryger i filen
               output.println(in);
            }
            
         }while(!in.equals("n"));
      
         System.out.print("Do you want to move data to a new file? [Y/N]: ");
         in = input.nextLine();
         if(in.equals("y")){
         
         //Indtaster den fil vi gerne vil hente indhold fra som skal i en ny fil
            Scanner reader = new Scanner(new File(nameFile + ".txt"));
            
            System.out.print("Write file name that you want to transfer your data to: ");
            String fileName = input.nextLine();
         
            for(String line; reader.hasNextLine() && (line = reader.nextLine()) != null; ) {
            
            
               PrintStream fileInput = new PrintStream(new FileOutputStream(fileName + ".txt", true));
               fileInput.println(line);
            
            //Printer filen ud i consolen
               //System.out.println(line);
            
            }
         
            Scanner read = new Scanner(new File(fileName + ".txt"));
            int tal = 0;
            int words = 0;
         
         //så længe der er noget filen
            while(read.hasNext()){
            
               if(read.hasNextDouble()){
               
                  tal++;
               }else{
               
                  words++;
               }
                              
               read.next();
            }
         
            System.out.println("Antal tal: " + tal);
            System.out.println("Antal words: " + words);
         
         
         }
         
      }
      catch(Exception e){
         
         System.out.println("Something went wrong!!!");
      }
      
      
         
   }



}