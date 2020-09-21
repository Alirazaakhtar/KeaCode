import java.util.Random;

public class Animal{

   private String art; 
   
   private int x;
   private int y; 
   
//Opretter Random objektet

   Random random = new Random();
   
   

//Konstruktør
   public Animal(String art){
   
      this.art = art;  
      
      x = random.nextInt(100)+1;
      y = random.nextInt(100)+1;
   
   }

// get method
   public String getArt(){
   
      return art;
   }

//is Mehtod

   public boolean isAnimalHere(int x, int y){
   
      return this.x == x && this.y == y;
   
   }









}