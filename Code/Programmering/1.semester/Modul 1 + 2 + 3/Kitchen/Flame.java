public class Flame{

   private int level; // 0 = off

   public void cooking (int level, String blus){
   
      System.out.println(blus + " is cooking at level: "+ level);
   
   }


/*Konstruktør
   public Flame(int newLevel){
   
      level = newLevel;
   }
/*

/*Overloading
   public Flame(){
      level = 43;
   
   }
*/
  
   public void setBlus(int level){
   
   this.level = level;
   
   }
   
   int GetLevel(){
   return level;
   }



}