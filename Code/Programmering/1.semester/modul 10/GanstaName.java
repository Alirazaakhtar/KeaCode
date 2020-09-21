import java.util.Scanner; 

public class GanstaName{

   public static void main(String[]args){
   
   
   
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Type your name?: ");
      String name = scan.nextLine();  
      
      //Spilt
      String first = name.substring(0,name.indexOf(" "));
      String last = name.substring(name.indexOf(" "));
      
      last = last.toUpperCase();
      String initial = first.substring(0,2);
     
      
   
      System.out.println("your gansta name is \"" + initial + " Diddy " + last + " " + first + "-izzie " );
   
   }



}