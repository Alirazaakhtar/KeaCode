public class Player{

   private String name; 
   private int score;


//konstruktør

   public Player(String name){
   
      this.name = name;
   
   }
   
   public void addScore(int dice){
   
      score = score + dice;
   
   }
   
   public int getScore(){
   
      return score;
   
   }
   
   public String getName(){
   
   return name;
   
   }



}