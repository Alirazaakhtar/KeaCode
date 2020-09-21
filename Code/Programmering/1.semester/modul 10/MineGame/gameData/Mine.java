package gameData;

import java.util.Random;

public class Mine{


   int x; 
   int y; 
   
   Random r = new Random();
   
   
//Konstruktør 
   public Mine(){
   
      x = r.nextInt(10)+2;
      y = r.nextInt(9)+2; 
   
   }
   
   public boolean isMine(int x, int y){
   
      return this.x == x && this.y == y;
   
   }
 
   public boolean isMineC(int x, int y){
   
      return (this.x == x+1 || this.x == x-1) && (this.y == y+1 || this.y == y-1);
   
   
   }
   
   public void mineReset(){
   
      x = r.nextInt(10)+2;
      y = r.nextInt(9)+2;
   
   }
    



}