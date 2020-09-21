import java.util.Random;

public class Gamedata{

   int randomNumber;



   public Gamedata(){
   // set randomNumber to random nubmer [1;10]
   
   for(int i = 0; i<20;i++){
      Random rand = new Random();
      randomNumber = rand.nextInt(10)+1;
   
      System.out.println(randomNumber);
      }
   
   }




}