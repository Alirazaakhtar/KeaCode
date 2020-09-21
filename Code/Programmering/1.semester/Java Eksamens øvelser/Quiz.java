import java.util.*;
public class Quiz{


   public static void main(String[]args){
   
      Scanner scan = new Scanner(System.in);
      
      BrainStory newStory = new BrainStory();
   
      System.out.println("Velkommen til teoriprøve kort-B");
   
   int number;
     
      
      do{
         System.out.println(newStory.getStory());
         
         System.out.println("1:"+ newStory.getChoice1());
         System.out.println("2:"+ newStory.getChoice2());
         
         System.out.print("Choose a option: ");
         number = scan.nextInt();
             
         newStory.nextQuestion(number);
         
         
            
         
      }while(true);
      
    
   
   }

}