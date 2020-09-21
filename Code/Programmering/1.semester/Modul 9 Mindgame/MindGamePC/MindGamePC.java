import java.util.Scanner;
public class MindGamePC{



   public static void main(String[]args){
   
      GameDataPC game = new GameDataPC();
      
      
   
    //Opret Scanner
      Scanner in = new Scanner(System.in);
   
      System.out.println("Welcome to MindGame\nThink of a number between 1-100 and let the computer guess it");
   
   
      game.playGame();
   
   }




}