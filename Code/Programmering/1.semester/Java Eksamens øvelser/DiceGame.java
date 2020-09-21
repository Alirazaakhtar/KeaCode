import java.util.*;
public class DiceGame{


   public static void main(String[]args){
   
      
    
   
      Player player1 = new Player("Hunter");
      Player player2 = new Player("John");
      Dice dice1;
   
   
      Scanner input = new Scanner(System.in);
   
      System.out.println("Welcome to the Ultimate game");
      
      while(true){
         
         
         
         
         System.out.println("\nPlayer 1 turn: " + player1.getName());
       
         
         int tries1 = 0;
         do{
            
            dice1 = new Dice();
               
            System.out.print("\nPress 1 to throw dice: ");
            int throwDice = input.nextInt();
            if(throwDice == 1){
               
               System.out.println("Dice: " + dice1.getDice());
               
            }
            
            if(dice1.getDice() == 6){
               player1.addScore(1);
                  
            }
            
            tries1++;
            System.out.println("Tries: " + tries1);
            System.out.println("Score: " + player1.getScore());
            
            
         }while(tries1 < 3);
         
         if(player1.getScore() == 2){
         
            System.out.println("\nPlayer 1 won");
            break;
         }
         
         
         
         
         System.out.println("\nPlayer 2 turn: " + player1.getName());
      
         
         int tries2 = 0;
         
         do{
            
            dice1 = new Dice();
                      
               
            System.out.print("\nPress 1 to throw dice: ");
            int throwDice = input.nextInt();
            if(throwDice == 1){
               
               System.out.println("Dice: " + dice1.getDice());
               
            }
            
            if(dice1.getDice() == 6){
               player2.addScore(1);
                  
            }
            
            tries2++;
            System.out.println("Tries: " + tries2);
            System.out.println("Score: " + player2.getScore());
         
            
            
         }while(tries2 < 3);
      
            
         if(player2.getScore() == 2){
         
            System.out.println("\nPlayer 2 won");
            break;
         }
         
                        
            
            
         
      }
      
      
      
     
      
      
   
   
   }
   

}