import java.util.Scanner; 

public class MindGameData{



   public void playGame(){
   
   
   
   
      RandomNumber rNumber = new RandomNumber();
   
      Scanner input = new Scanner(System.in);
   
      int tries = 0; 
      System.out.println("Welcome to The Ultimate MindGame");
      System.out.print("Guess a number between 1 to 100: ");
   
   
      while(true){
      
         int in = input.nextInt();
      
         if(rNumber.isGuessCorrect(in)){
         
            System.out.println("\nCONGRATULATIONS!!!\nWell done mate, you guessed the number rigth = " + rNumber.getNumber());
            System.out.println("Tries: " + tries);
            
            System.out.println("play again 1 = Yes, or 0 = No");
            
            in = input.nextInt();
            if(in == 1){
               playGame();
            }
            else{
               break;
            }
         }
      
            
         
         if(rNumber.getNumber()<in){
         
            System.out.println("The number is less then what your have guessed");
         
         }
         else if(rNumber.getNumber()>in){
         
            System.out.println("The number is bigger then what your have guessed");
         
         }
      
         tries++;
      
      
      
      }
   
   
   }



}