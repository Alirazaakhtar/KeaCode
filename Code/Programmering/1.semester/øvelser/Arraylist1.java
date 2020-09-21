
public class Arraylist1{

   public static void main(String[]args){
   
     
   
   //opret objekt 
      ArrayList2 addArray = new ArrayList2();
   
   
      System.out.println("Enter a number i the arrayList and type 0 for finish");
    // indsætter tal i array
      addArray.input();
      
      System.out.println("You have typed 0\n-----------------");
      
      addArray.printArray();
      
      
      System.out.println("\nNow type the number you want to delete?");
      addArray.remove();
      System.out.println("-------------------");
      addArray.printArray();
   
   
   
   }

}