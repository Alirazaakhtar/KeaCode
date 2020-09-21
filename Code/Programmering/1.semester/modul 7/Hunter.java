import java.util.*;

public class Hunter{

   private String name;
   private int x;
   private int y;

//Opretter random objekt
   Random random = new Random();

//Konstruktør
   public Hunter(String name){
   
      this.name = name; 
      
      x = random.nextInt(100)+1;
      y = random.nextInt(100)+1;
     
   }

// get Method 
   public String getName(){
   
      return name; 
   
   }
   
   // is method
  
   public boolean isWithInRange(int x, int y){
   
      return (x<this.x+16 && x>this.x-16)&&(y<this.y+16 && y>this.y-16);
   
   }

   public boolean isHunterHere(int x, int y){
   
      return this.x == x && this.y == y;
   }

}