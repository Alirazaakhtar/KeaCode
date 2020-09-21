import java.util.Scanner;
public class StateIf{

 

   public static void main(String[]args){
   
      double economic = 10;
   
      if(economic >= 12000){
      
         System.out.println("Your budget is high for this month: " + economic +"kr");
      
      }else if(economic <= 10000 && economic >= 5000){
      
         System.out.println("Your budget is evrage for this month: " + economic +"kr");
      
      }else{//if budget is under 5000
      
         System.out.println("Your bugdet is low, you have some serious problem. Your budget is: "+ economic + "kr");
      
      }
   
   ////////////////////////////
   
      Scanner input = new Scanner(System.in);
   
      int kills = 0;
   
      kills = input.nextInt();
      
      
   
      if(kills == 1){
      
         System.out.println("You have 1 kill");
      
      }else if (kills >=0 && kills <=5){
      
         System.out.println("Between 0 to 5 kills");
      
      }else{
      
         for(int i = kills; i<=10; i++){
         
            System.out.println(i);
         
         }
      
         System.out.println("More then 5 kills achived");
      
      }
      
      int x = input.nextInt();
      
      while(x >10 && x<20){
      
      x++;
      System.out.println("x: " + x);
      
      }
   
   int y = 4; 
   
   switch(y){
   case 1:
   break;
   
   case 2:
   break;
   
   case 3:
   break;
   
   default:
   System.out.println("Bonga");
   }
   System.out.println("y = " + y);
   
   }


}