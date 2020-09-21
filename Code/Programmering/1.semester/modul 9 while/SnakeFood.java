import java.util.Random; 

public class SnakeFood{

   private String name; 
   private int x; 
   private int y; 

//opretter random objekt
   Random r = new Random();

//konstruktør
   public SnakeFood(String name){
   
      this.name = name;
      
      x = r.nextInt(10)+1;
      y = r.nextInt(10)+1;
      
   
   }
   
   public void replaceApple(){
   
      x = r.nextInt(10)+1;
      y = r.nextInt(10)+1;
   
   
   
   }
   
   
   
   
   public String getName(){
   
      return name; 
   
   }
         
   public int isX(){//PROBLEMER
   
      return x;
   
   }
   public int isY(){//PROBLEMER
   
      return y;
   
   }

   
   
   public void showPosition(){
   
      System.out.println(name + " is on position x = " + x + ", y = " + y + "\n---------------");
   
   }
   
   
}