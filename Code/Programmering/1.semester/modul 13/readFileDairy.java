import java.util.*;
import java.io.*;
public class readFileDairy{

   public static void main(String [] args){
   
     
      File file;
      
      Scanner write = new Scanner(System.in);
       
      String input;
   
      
      
   
      try{
      
         

      
         
                     
         System.out.println("Write something to your dairy: ");
         do{
         
            // FileOutputStream(String, boolean) gør at man kan blive ved med at tilføje tekst til filen uden at override den.
            //og hvis filen ikke eksisterer så opretter den filen. 
            PrintStream createFile = new PrintStream(new FileOutputStream("Peter3.txt", true));
            input = write.nextLine();
            //Write to file
            createFile.println(input);
           
         
         }while(!input.equals("n"));
         
         //En anden måde at oprette en fil på, og skrive til den.
         Formatter newFile = new Formatter("James.txt");
         newFile.format("gdfgdfg");
         newFile.close();
         
         
         //Printer hele filen ud.
         Scanner reader = new Scanner(new File("Peter3.txt"));
      
         for(String line; reader.hasNextLine() && (line = reader.nextLine()) != null; ) {
         
            System.out.println(line);
         
         }
         
      
      }
      catch(Exception e){
      
         System.out.println("not found");
      
      
      }
   
   
   }
   
   //vi har oppe i static lavet en try & catch, men det behøver vi ikke her denne metoden
   //da vi bruger "throws Exception", hvor i vores static main håndtere hvis der er fejl
   public static void metodeB() throws Exception
   {
   
     
      Scanner input = new Scanner(new File("james.txt"));
      
      String in = input.nextLine();
      
      System.out.println(in);
   
   
   
   }




}