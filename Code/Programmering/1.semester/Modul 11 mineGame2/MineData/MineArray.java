package MineData;
import java.util.*;
public class MineArray{


   public void newMines(boolean[][] gameField){
   
      Random random = new Random(); 
   
      
   
   //Vi nulstiller minefelter
   
      for(int a = 0; a < 10; a++){
      
         for(int b = 0; b <10; b++){
            gameField[a][b] = false; 
         }
      
      }
      
      for(int x = 1; x<=10; x++){
      
      //placerer minerne
         gameField[random.nextInt(10)][random.nextInt(10)] = true;
      
      }
      
      gameField[0][0] = false;
      gameField[9][9] = false;
   }




}