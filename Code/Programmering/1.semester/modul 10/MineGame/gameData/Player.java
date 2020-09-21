package gameData;

import java.util.Scanner; 

public class Player{

   private String name;
   int x; 
   int y; 
   
   Scanner scan = new Scanner(System.in);

//Konstruktør
   public Player(String name){
   
      this.name = name;
   
      x = 1;
      y = 1;
   
   }
   
   
   Mine mine1 = new Mine();
   Mine mine2 = new Mine();
   Mine mine3 = new Mine();
   Mine mine4 = new Mine();
   Mine mine5 = new Mine();
   Mine mine6 = new Mine();
   Mine mine7 = new Mine();
   Mine mine8 = new Mine();
   Mine mine9 = new Mine();
   Mine mine10 = new Mine();
   
      
   
       
   public void movePlayer(){
   
      
   
   
      while(true){
      
         String input = scan.nextLine();
      
      //OP
         if(input.equals("w") && y<10){
         
            y++;
            showPlayer();
          
         }
      //NED
         if(input.equals("s") && y>1){
         
            y--;
            showPlayer();
         }
      //VENSTRE
         if(input.equals("a") && x>1){
         
            x--;
            showPlayer();
         }
      //HØJRE
         if(input.equals("d") && x<10){
         
            x++;
            showPlayer();
         }
         
         //Hvis player når 10x10
         
         if(x == 10 && y == 10){
         
            System.out.println("CONGRATULATION!!! You made it alive ;)");
            break;
         }
         
         //Hvis player er tæt på bomben
         if(mine1.isMineC(x,y) || mine2.isMineC(x,y) || mine3.isMineC(x,y) || mine4.isMineC(x,y) || mine5.isMineC(x,y) || mine6.isMineC(x,y) || mine7.isMineC(x,y) || mine8.isMineC(x,y) || mine9.isMineC(x,y) || mine10.isMineC(x,y)){
            System.out.println("DANGER!!! Bomb is close, be carefull");
         }
         
         // Hvis man player går ind i bomben
         if(mine1.isMine(x,y) || mine2.isMine(x,y) || mine3.isMine(x,y) || mine4.isMine(x,y) || mine5.isMine(x,y) || mine6.isMine(x,y) || mine7.isMine(x,y) || mine8.isMine(x,y) || mine9.isMine(x,y) || mine10.isMine(x,y)){
         
            System.out.println("BOOOM\nGame Over");
            break;
         }
      
      }
   
   
   
   }

   public void showPlayer (){
   
      System.out.println("Player is on position (" + x + ", " + y + ")");
   
   }
   
   public void showIntro(){
   
      System.out.println("Welcome to MineGame");
   }

   
   public void playerReset(){
   
      x = 1;
      y = 1;
   
   }
   
   public void mineReset(){
   
      mine1.mineReset();
      mine2.mineReset();
      mine3.mineReset();
      mine4.mineReset();
      mine5.mineReset();
      mine6.mineReset();
      mine7.mineReset();
      mine8.mineReset();
      mine9.mineReset();
      mine10.mineReset();
   
   
   }


}