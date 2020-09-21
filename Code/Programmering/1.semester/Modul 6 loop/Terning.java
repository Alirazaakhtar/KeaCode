import java.util.Random; 
public class Terning{

   private int terning;
   
   Random nyRandom = new Random();

//kontstruktør
   public Terning(){
      terning = -1;
   }

// getter method
   public int getTerning(){
   
      return terning;
   
   }


// Kaster med terning

   public void kastTerning(){
   
   terning = nyRandom.nextInt(6)+1;
   
   }

}

