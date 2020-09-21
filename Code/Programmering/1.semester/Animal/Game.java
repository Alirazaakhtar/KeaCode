import java.util.ArrayList;
import java.util.Scanner;

public class Game{

   public static void main(String[]args){
   
      Animal panda = new Panda();
      Animal tiger = new Tiger();
      Animal flagermus = new Flagermus();
      
      Scanner input;
   
      Animal[] animalList = {panda, tiger, flagermus};
      
      panda.eat();
      
      animalList[0].setName("Panda");
      animalList[1].setName("Tiger");
      animalList[2].setName("Flagermus");
   
      for(int i = 0; i< animalList.length; i++){
      
      
         System.out.println(animalList[i].getName());
      }
      
      
      
     
               
      while(true){
      
         try{
         
            input = new Scanner(System.in);
            
         
            System.out.print("Type a number: ");
            int num = input.nextInt();
         
         
            if(num == 1){
            
               System.out.println("you Pressed 1");
            }
            else if(num == 2){
               System.out.println("You have pressed 2");
            }
            else if(num == 0){
               break;
            }
            else{
               System.out.println("Please choose a optional number");
            }
         
         }
         catch(Exception e){
         
            System.out.println("The menu only takes integers");
         
         }
      
      }
   
   
   
   
   /*
      Panda panda = new Panda("Panda");
      Tiger tiger = new Tiger("Tiger");
      Flagermus flagermus = new Flagermus("Flagermus");
   
      ArrayList<Animal> animalList = new ArrayList<Animal>();
   
      animalList.add(panda);
      animalList.add(tiger);
      animalList.add(flagermus);
      
      for(int i = 0; i < animalList.size();i++){
      animalList.get(i).eat();
   }
   
   */
   }

}