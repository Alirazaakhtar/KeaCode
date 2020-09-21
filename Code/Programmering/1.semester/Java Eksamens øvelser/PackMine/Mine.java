package PackMine;
import java.util.*;
public class Mine{

   private int x;
   private int y;

   Random r = new Random();

   public Mine(){
   
      x = r.nextInt(9)+1;
      y = r.nextInt(10)+1;
   
   }
   
   public boolean isOnMine(int x, int y){
   
      return this.x == x && this.y == y;
   
   }
   
   public boolean warning(int x, int y){
   
      return x == this.x +1 &&  x == this.x -1 && y == this.y + 1 && y == this.y - 1;
   
   }
   
   public void printMine(){
   
      System.out.println("The Mine is position: (" + x + "," + y + ")");
   
   }



 
}