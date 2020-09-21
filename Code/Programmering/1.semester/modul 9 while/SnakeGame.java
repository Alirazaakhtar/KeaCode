import java.util.Scanner;

public class SnakeGame{


//PROGRAM
   public static void main (String[]args){
   
   
   //Henter apple objekt
   
      Snake snake1 = new Snake("Snake");
      
      // Scanner 
      Scanner input = new Scanner(System.in);
   
   
      SnakeGame theGame = new SnakeGame();
   
      theGame.game();   
   
   
   
              
    
    
    
   }
  
   public void game(){
   
   //Henter apple objekt
   
      Snake snake1 = new Snake("Snake");
      
   
      
      // Scanner 
      Scanner input = new Scanner(System.in);
   
         
      
      
   
   
   
   //Start info
   
      snake1.startIntro();
      snake1.apple1.showPosition();
   
   
    
    //LAV while til at styre Snake
      System.out.print("Press a key to move: ");
      String in = input.nextLine();
   
   
   // Stop programmet ved at trykke "e"
      while(!in.equals("e")){
      
      
      //OP
         if(in.equals("w")){
         
            snake1.moveSnake(0,1);
            
            snake1.showPosition();
                      
         }
         
         //NED
         if(in.equals("s")){
         
            snake1.moveSnake(0,-1);
            
            snake1.showPosition();
            
                        
         }
         
         //VENSTRE
         if(in.equals("a")){
         
            snake1.moveSnake(-1,0);
         
            snake1.showPosition();
            
                        
         }
         
         
         //HØJRE
         if(in.equals("d")){
         
            snake1.moveSnake(1,0);
         
            snake1.showPosition();
            
         }
         
         if(snake1.isScore()){
         
            break;
         }
         
         // for at taste ind igen
         in = input.nextLine();
        
        
      
      }
   
   //Afslut tekst 
   
      snake1.endGame();
    
   
   }

  
   

}




