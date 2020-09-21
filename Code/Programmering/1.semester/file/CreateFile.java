import java.util.Scanner;


public class CreateFile{


   public static void main(String[]args){
   
      CreateFile2 file = new CreateFile2();
      
      Scanner scan = new Scanner(System.in);
      
      
      System.out.print("Enter name of file.docx: ");
      String in = scan.nextLine();
      file.openFile(in);
      
      
      System.out.print("Enter text to file: ");
      String input = scan.nextLine();
      file.writeFile(input);
      
      
      System.out.print("Enter textff to file: ");
      String inp = scan.nextLine();
      file.writeFile(inp);
      

      
      
      file.closeFile();
   
   
   }
}