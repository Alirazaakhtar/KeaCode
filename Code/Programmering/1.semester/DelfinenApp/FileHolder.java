import java.util.*;
import java.io.*;


public class FileHolder{


   Formatter file;
   
   
   public void loadToArrayList() throws FileNotFoundException{
   
      Scanner s = new Scanner(new File("filepath"));
      ArrayList<String> list = new ArrayList<String>();
      while (s.hasNext()){
         list.add(s.next());
      }
      s.close();
   
   }

   public void createFile(String name){
   
      try{
      
         file = new Formatter(name + ".txt");
         System.out.println("Member created...");
      }
      catch(Exception e){
      
         System.out.println("Arrangement not created");
      
      }
   }
   
 
   public void writeFile(String name, String text){
   
          
      
   
      try{
      
              
       
         
         
            // FileOutputStream(String, boolean) gør at man kan blive ved med at tilføje tekst til filen uden at override den.
            //og hvis filen ikke eksisterer så opretter den filen. 
         PrintStream createFile = new PrintStream(new FileOutputStream(name + ".txt", true));
            
            //Write to file
         createFile.println(text);
           
         
         
        /* //En anden måde at oprette en fil på, og skrive til den.
         Formatter newFile = new Formatter("James.txt");
         newFile.format("gdfgdfg");
         newFile.close();
         */
                     
      
      }
      catch(Exception e){
      
         System.out.println("not found");
      
      
      }
   
   
   
   }  
   
   /*
   public void writeFile(String text){
   
      file.format(text);
   
   
   }*/
   
   public void closeFile(){
   
      file.close();
   
   }
   
   public void deleteFile(String fileName){
   
      try{
      
         File file = new File( fileName +".txt");
      
         file.delete();
         System.out.println("Member deleted\n");
      
      }
      catch(Exception e){
      
         System.out.println("Member not deleted\n");
      
      }
   
   
   }
   
   
   
   public void printMember(String name){
      
      try{
      //Create a Scanner that reads from the File
         Scanner input = new Scanner(new File(name + ".txt"));
      
      //while loop with hasNext method
         while (input.hasNextLine()){
            String text = input.nextLine();
            System.out.println(text);
         }
      
      }
      catch(Exception e){
      
         System.out.println("File not found...");
      
      }
   }

   
   public void printFile(String name){
   
   
      try{
      
         //Printer hele filen ud
         Scanner reader = new Scanner(new File(name +".txt"));
      
         for(String line; reader.hasNextLine() && (line = reader.nextLine()) != null; ) {
         
            System.out.println(line);
         
         }
      }
      catch(Exception e){
      
         System.out.println("could not find file...");
      
      }
   
   }
   
   //Til readFile
   StringBuffer stringBufferOfData = new StringBuffer();
   Scanner in = new Scanner(System.in);

   String fileName;

   
   public boolean readFile(){
   
      System.out.print("Please enter the member name: ");
      fileName = in.nextLine();
      System.out.println();
      Scanner fileToRead;
      
      
      try{
         fileToRead = new Scanner(new File(fileName + ".txt")); //point the scanner method to a file
         
         //check if there is a next line and it is not null and then read it in
         for (String line; fileToRead.hasNextLine() && (line = fileToRead.nextLine()) != null; ) {
            System.out.println(line);//print each line as its read
            stringBufferOfData.append(line).append("\r\n");//this small line here is to appened all text read in from the file to a string buffer which will be used to edit the contents of the file
         }
         
         fileToRead.close();
            
      }
         
      catch(Exception e){
         
         System.out.println("The file " +fileName+ " could not be found!!" );
         
      }
      
      return true;
   }

   public void writeToFile(){
   
      try {
         BufferedWriter bufwriter = new BufferedWriter(new FileWriter(fileName +".txt"));
         bufwriter.write(stringBufferOfData.toString());//writes the edited string buffer to the new file
         bufwriter.close();//closes the file
      } catch (Exception e) {//if an exception occurs
         System.out.println("Error occured while attempting to write to file: " + e.getMessage());
      }
   
   }
   
   public void replacement(){
      System.out.print("Please enter the contents of a line you would like to edit: ");
      String lineToEdit = in.nextLine();
   
      System.out.print("Please enter the the replacement text: ");
      String replacementText = in.nextLine();
   
      int startIndex = stringBufferOfData.indexOf(lineToEdit); // Vi får starts punktet for den linje vi kan vil ersatte
      int endIndex = startIndex + lineToEdit.length(); //now we add the staring index of the text with text length to get the end index
   
      stringBufferOfData.replace(startIndex, endIndex, replacementText); // Det her man bytter på orderne
   
      System.out.println("Here is the new edited Info:\n" + stringBufferOfData); // for at se om orderne var replaced
   
   }

  




}