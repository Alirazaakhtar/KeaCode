import java.util.*;

public class Delfinen{

   public static void main(String[]args){
   
      Menu createMenu = new Menu();
   
   
      while(true){
         try{
         
         
            System.out.println("\n|WELCOME TO DELFINEN|\nSelect a Login?:");
            System.out.println("------------------------------");
            System.out.println("|1.Manager                   |");
            System.out.println("|2.Cashier                   |");
            System.out.println("|3.Trainer                   |");
            System.out.println("------------------------------");
            System.out.println("|0.Exit program              |");
            System.out.println("------------------------------");
         
            Scanner scan = new Scanner(System.in);
         
         
            System.out.print("Type a number?: ");
            int input = scan.nextInt();
         
         
         
            if(input == 1){
            
               createMenu.menuManager();
            
            }
         
         
            if(input == 2){
            
               createMenu.menuCashier();
            
            }
         
         
            if(input == 3){
            
               createMenu.menuTrainer();
            
            
            }
         
         
            if(input == 0){
            
               break;
            
            }
         
            if(input > 3){
            
               System.out.println("The menu only have 4 options... Choose a option between 0-3");
            
            }
         
         
         
         }
         catch(Exception e){
         
            System.out.println("The menu only takes Integer.. Please try again");
         
         }
      
      
      
      
      }
   };



}