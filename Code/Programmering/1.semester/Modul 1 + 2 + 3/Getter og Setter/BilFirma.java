import java.util.Scanner;

public class BilFirma {

// PROGRAM


   public static void main (String [] args){
   
   
   
    // Opretter et objetk
      Bil nyBil = new Bil();
   
      // Opretter en scanner
      Scanner input = new Scanner(System.in);
   
   
   
   //opretter et objekt
      Login myLogin = new Login();
   
      //Name         
      System.out.println("Login: ");
      System.out.print("Type name: ");
      String typeName;
      typeName = input.nextLine();      
      
      if(typeName.equals(myLogin.getName())){
      
      //Password
         int typePassword;
         System.out.print("Type 4 integer password: ");
      
         typePassword = input.nextInt();
      
          
         if(typePassword == myLogin.getPassword()){
         
         
         // Opretter en scanner
            Scanner input1 = new Scanner(System.in);
         
         
         
         
         //insætter velkomst hilsen
            System.out.println("Velkommen " + myLogin.getName()+ "\n");
         
         //
            System.out.print("Vælg bil mærke du gerne vil sælge: ");
            nyBil.setName(input1.nextLine());
            System.out.println("Bil Mærke: " + nyBil.getName());
         
         //
            System.out.print("Sæt pris");
            nyBil.setPris(input1.nextDouble());
         //
            System.out.print("Antal gear?:");
            nyBil.setGear(input.nextInt());
         // Alt infomation
            System.out.println("\nDu har hermed oprettet din bil ");
            System.out.println("Bil info: \nMærke: " + nyBil.getName() + "\nPris: " + nyBil.getPris() + " kr\nAntal gear: " + nyBil.getGear());
         
         
         
         }
         else{
            System.out.print("ERROR: Wrong code...");
         }
      }
      else {
         System.out.println("ERROR: Wrong name...");
      }
   }

}