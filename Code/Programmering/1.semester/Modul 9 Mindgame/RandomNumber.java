import java.util.Random; 
public class RandomNumber{

   int number; 
   
   
   Random random = new Random();

//Kønstruktør

   public RandomNumber(){
   
      number = random.nextInt(100)+1;
   
   }
   
   
   public boolean isGuessCorrect(int number){
   
      return this.number == number;
   
   
   }
   
   public int getNumber(){
   
      return number;
   }







}