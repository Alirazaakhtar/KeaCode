import gameData.Player;
import java.util.Scanner;
public class MineGame{



   public static void main (String[]args){
   
   
      Player game = new Player("MineKiller");
      Scanner scan = new Scanner(System.in);
      
      
      game.showIntro();
      System.out.println("Press R = Ready button to play: ");
      String in = scan.nextLine();
      System.out.println("Your position is 1.1 and your tagget is to get to 10.10\nWithout touching any of the bombs");
      System.out.println("Play comtrols\nW = UP\nS = DOWN\nA = LEFT\nD = RIGTH" );
      
      do{
      System.out.println("Be carefull, many have died:/ ");
      game.playerReset();
      game.mineReset();
         
         game.movePlayer();
      
         System.out.print("Do you want to play again?[Y/N] ");
       
         in = scan.next();
      
      }while(in.equals("y") || in.equals("Y") );
   }

}