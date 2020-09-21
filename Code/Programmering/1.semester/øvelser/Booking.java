import java.util.Scanner;

public class Booking{

   public static void main (String[]args){
   
      Scanner input = new Scanner(System.in);
   
   
      Travler newTravler = new Travler();
   
   
   
   
   
   //booking
      System.out.println("Type information for booking:");
   
      System.out.print("Name: ");
      newTravler.setName(input.nextLine());
   
      System.out.print("Age: ");
   
      newTravler.setAge(input.nextInt());
   
      System.out.print("Cpr nr: ");
      newTravler.setCpr(input.nextInt());
   
   //System.out.print("Choose country to travel?: ");
   //newTravler.setLand(input.nextLine());
   
      System.out.print("How many travelers?: ");
      newTravler.setPeople(input.nextInt());
   
      System.out.println("How would you likw to pay?: ");
      System.out.println("1. Bank transfer\n2. CreditCard" );
   
      int bank = 1;
      int card = 2;
   
      if(bank == input.nextInt()){
         System.out.println("You have choosen Bank transfer:");
         System.out.println("Link to Payment has been sent to your mail\nInfo: ");
         newTravler.showInfo();
      
      }else if(card == input.nextInt()){
         System.out.println("You have choosen CreditCard ");
         System.out.println("Link to Payment has been sent to yur mail\nInfo: ");
         newTravler.showInfo();
      
      } else{
         System.out.println("ERROR");
      
      
      }
   
   
   
   
   }


}