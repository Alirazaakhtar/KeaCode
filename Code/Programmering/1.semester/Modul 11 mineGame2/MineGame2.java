import MineData.*;

public class MineGame2{


   public static void main(String[]args){
   
      Player game = new Player("BombMan");
      
      
      
      
      System.out.println("Welcome to MineGame!!!");
         System.out.println("Your position is 1.1 and your tagget is to get to 10.10\nWithout touching any of the bombs");
      System.out.println("Play comtrols\nW = UP\nS = DOWN\nA = LEFT\nD = RIGTH" );
      
   
      
   
      game.movePlayer();
   
   }


}