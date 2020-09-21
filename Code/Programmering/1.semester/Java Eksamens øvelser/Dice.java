import java.util.Random;

public class Dice{

   private int dice;

   Random r = new Random();
   
   
   //Konstruktør
   public Dice (){
   
      dice = r.nextInt(6)+1;
   
   }
   
   
   public int getDice(){
   
      return dice;
   
   
   }
   






}