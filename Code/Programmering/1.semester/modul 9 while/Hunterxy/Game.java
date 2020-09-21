import java.util.Scanner; 

public class Game{

 

   public static void main (String [] args){
   
      Scanner input = new Scanner(System.in);
      
      Spiller player = new Spiller("player1");
   
   
      System.out.println("Velkommen til The Jungle\n---------");
      System.out.println("Press to play\nW = op\nS = ned\nA = venstre\nD = højre\nR = afslut");
      System.out.print("Press a key to move in the Jungle: ");
      String in = input.nextLine();
   
     
   // hvis r = input,så stop
      while(!in.equals("r")) {
      
         
         // op
         if(in.equals("w")){
            player.movePlayer(0,1);
            player.showPlayer();
         }
      
         // ned
         if(in.equals("s")){
            player.movePlayer(0,-1);
            player.showPlayer();
         }
      
      // venstre
         if(in.equals("a")){
            player.movePlayer(-1,0);
            player.showPlayer();
         }
         
        // højre
         if(in.equals("d")){
            player.movePlayer(1,0);
            player.showPlayer();
         }
         
         System.out.print("Press a key to move: ");
         in = input.nextLine();
        
      }
      
      System.out.println("\n-----------\nFinal position in the jungle");
      player.showPlayer();
   
   }



}