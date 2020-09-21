package MineData;
import java.util.*;


public class Player {

   String name; 
   int x; 
   int y; 
   
   
   Random random = new Random();
   
   MineMap map = new MineMap();
   
   

   
   Scanner input = new Scanner(System.in);
   


   public Player(String name){
   
      this.name = name; 
   
   }
   
   public void mines(){
   
   }


   public void movePlayer(){
   
      boolean [][] gameMatrix = new boolean [10][10];
   
      MineArray mineField = new MineArray();
      mineField.newMines(gameMatrix);
      
      //Så man kan bruge scanneren i do og uden for do
      String in;
       
      do{
      
         x = 0;
         y = 0;
         mineField.newMines(gameMatrix);
         
         System.out.println("Best of luck!!");
      
         do{
         
            System.out.print("Press a control to move: ");
            in = input.nextLine();
         
         //UP
            if(in.equals("w") && y<9){
            
               y++;
               //y = y + 1;
            
               showPlayer();
            
            }
         //DOWN
            if(in.equals("s") && y>0){
            
               y--;
               //y = y - 1;
               
            
               showPlayer();
            
            }
         
         //LEFT
            if(in.equals("a") && x>0){
            
               x = x - 1;
            
               showPlayer();
            
            }
         
         //RIGTH
            if(in.equals("d") && x<9){
            
               x = x + 1;
            
               showPlayer();
            
            }  
            
            
            //Hvis vi er tæt på bomben 
            if( (x<9 && gameMatrix[x+1][y]) || (x>0 && gameMatrix[x-1][y]) || (y>0 && gameMatrix[x][y-1]) || (y<9 && gameMatrix[x][y+1])){
               System.out.println("DANGER - Bomb is close!!!");
            }
            
            if(gameMatrix[x][y]){
            
               System.out.println("BOOOM!!!");
               break;
            }
            
            
            //Når man vinder spillet
            if(x == 9 && y == 9){
               System.out.println("CONGRATULATION! YOU MADE IT ALIVE");
               break;
            }
         
                   
         }while(true);
         
         System.out.println("Do you want to play again? Press y = yes or n = no");
         in = input.nextLine();
      
      }while(in.equals("y") || in.equals("Y")); 
   }
   
    
   public void showPlayer(){
   
   
      System.out.println("The player is on: ("+ x + ", " + y + ")"); 
   
   
   }


     

}