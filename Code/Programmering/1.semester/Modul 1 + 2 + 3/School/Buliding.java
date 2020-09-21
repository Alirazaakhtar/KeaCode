import java.util.Scanner;

public class Buliding{

   int window; 
   int doors;
   String director; 
   int lectuers;
   double size;
   
   Scanner type = new Scanner(System.in);
 
   public void buildWindow(){
   
      System.out.println("Byg din egen antal vinduer? tast et antal ind ");
   
      window = type.nextInt();
   
      System.out.println("Total windows: " + window);
   
   }
   public void buildDoors(){
   
      System.out.println("Choose the amount of doors in the School? type amount..."); 
   
      doors = type.nextInt();
   
      System.out.println("Total doors in the school; " + doors);
   
   }
   public void buildStaff(){
   
      System.out.println("Type the amount of lectuers you want to have in School? ");
   
      lectuers = type.nextInt();
   
      System.out.println("Straff number: " + lectuers);
   
   
   }
   
   

   public void size(){
   
      System.out.println("Choose the size for the school? Type any number...");
      size = type.nextDouble();
   
      System.out.println("The size is: " + size + " cm^2");
   
   }


}