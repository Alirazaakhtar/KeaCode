import java.util.Scanner;
import java.util.Random; 
public class GameDataPC{


  
   
   
   //Opret Scanner
   Scanner in = new Scanner(System.in);
   Random rd = new Random();
   



   public void playGame(){
   
      
   
   
      while(true){
         System.out.print("Lets go!\nIs the number higher og lower then 50?:  ");
         String input = in.nextLine(); 
         
         //Higher then 50
         
         if(input.equals("higher")){
         
            System.out.print("Is the number higher or lower then 75?: ");
            input = in.nextLine();
             
             //higher then 75
             
            if(input.equals("higher")){
               while(!input.equals("y")){
                  System.out.print("Is this your number?: ");
                  int tal = rd.nextInt(25)+76; 
                  System.out.println(tal);
                  System.out.println("Type y = Yes or n = No: ");
                  input = in.nextLine();
               }
               System.out.println("--------------------------\nThe computer guessed rigth\n--------------------------");
               break;
            }
            
            //lower then 75
              
            if(input.equals("lower")){
               while(!input.equals("y")){
                  System.out.print("Is this your number?: ");
                  int tal = rd.nextInt(25)+51; 
                  System.out.println(tal);
                  System.out.println("Type y = Yes or n = No: ");
                  input = in.nextLine();
               }
               System.out.println("--------------------------\nThe computer guessed rigth\n--------------------------");
               break;
            }
         }
         
         // Lower then 50
         
         if(input.equals("lower")){
         
            System.out.print("Is the number higher or lower then 25?: ");
            input = in.nextLine();
              
          // higher then 25
             
            if(input.equals("higher")){
               while(!input.equals("y")){
                  System.out.print("Is this your number?: ");
                  int tal = rd.nextInt(25)+26; 
                  System.out.println(tal);
                  System.out.println("Type y = Yes or n = No: ");
                  input = in.nextLine();
               }
               System.out.println("--------------------------\nThe computer guessed rigth\n--------------------------");
               break;
            }
             
             //lower then 25 
              
            if(input.equals("lower")){
               while(!input.equals("y")){
                  System.out.print("Is this your number?: ");
                  int tal = rd.nextInt(25)+1; 
                  System.out.println(tal);
                  System.out.println("Type y = Yes or n = No: ");
                  input = in.nextLine();
               }
               System.out.println("--------------------------\nThe computer guessed rigth\n--------------------------");
               break;
            }
         }
         
      
         
      }
   }

}