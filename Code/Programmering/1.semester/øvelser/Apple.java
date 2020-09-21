import java.util.Random;

public class Apple {


   private String name; 
   private int x; 
   private int y; 

// opretter random objekt
   Random random = new Random();


//konstruktør
   public Apple(){
   
      this.name = "Apple"; 
   
      this.x = random.nextInt(10)+1;
      this.y = random.nextInt(10)+1;
   
   
   }
   
   public void setName(String name){
   
   this.name = name;
   
   }
   
   
   public String getName(){
   
      return name; 
   
   }
   
   public boolean isAppleHere(int x, int y){
   
      return this.x == x && this.y == x;
   
   }


}