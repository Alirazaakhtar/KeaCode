
import java.util.Scanner; 

public class Snake{

   private String name; 
   private int x;
   private int y;
   private int score; 
   
   
   
   SnakeFood apple1 = new SnakeFood("Apple");

 //konstruktør
   public Snake(String name){
   
      this.name = name; 
      
     // start position
     
      x = 5;
      y = 5;
   
   }
   
   
   
   public void moveSnake(int z, int a){
   
      x = x + z;
      y = y + a;
      
           
         
      if(x == apple1.isX() && y == apple1.isY()){
         score++;
         apple1.replaceApple();
         apple1.showPosition();
         
         
      }
      
   
   
   // sætter x grænser mellem 0 til 10 
   
      if(x>10){
      
         x = 10;
         
         outOfArea();
         
      }
      
      if(x<0){
      
         x = 0;
         
         outOfArea();
      }
      
       // sætter y grænser  mellem 0 til 10
      
      if(y>10){
      
         y = 10;
         
         outOfArea();
         
      }
      
      if(y<0){
      
      y = 0;
            
         outOfArea();
      }
      
            
   
   }
   
 
 
 
   public boolean isScore(){
   
      return score == 5;
   
   }
 


      
   public void showPosition(){
   
      System.out.println("The Snake is on x = " + this.x + ", y = " + this.y);
      System.out.println("Score: " + score);
   }
   
  
   
   public void outOfArea(){
   
      System.out.println("Stop, you are going out of area");
   
   }


   public String getName(){
   
      return name; 
   
   }


   public void startIntro(){
   
      System.out.println("WELCOME TO SNAKEREVENGE!!!");
      System.out.println("Your tagget is to eat as many apple1 as posible");
      System.out.println("Playcontrol buttons");
      System.out.println("W = UP\nS = DOWN\nD = RIGTH\nA = LEFT\nE = END GAME");
   
      System.out.println("---------------");
   
   //Where is the Snake? 
      showPosition();
   }
   
   public void endGame(){
   
      System.out.println("GAMEOVER\nScore: " + score);
   
   }

}