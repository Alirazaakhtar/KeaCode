import java.util.*;
import java.io.*;


public class MainContact{


   public static void main(String [] args){
   
      ArrayList<String> contactList = new ArrayList<String>();
      
      FileHandler handler = new FileHandler();
   
           
   
      do{
      
         try{
         
            try (BufferedReader reader = new BufferedReader(new FileReader("Contact.txt"))) {
               while (reader.ready()) {
                  contactList.add(reader.readLine());
               }
            }
            catch (IOException e) {
            // Handle a potential exception
            }
         
         
         
            Scanner scan = new Scanner(System.in);
         
         
            System.out.println("\n1) Print all contacts on  screen");
            System.out.println("2) delete one of contact");
            System.out.println("3) Add new Contact");
            System.out.println("0) Exit");
         
            System.out.print("Type a number from the menu: ");
            int input = scan.nextInt();
         
         
            if(input == 1){
            
               handler.printFile();
            
            }
         
         
            if(input == 2){
            
               handler.printFile();
            
               System.out.println("which number do you want to delete?: (0...1.2)");
               int number = scan.nextInt();
               contactList.remove(number);
               Formatter overide = new Formatter("Contact.txt");
            
               PrintStream newFile = new PrintStream(new FileOutputStream("Contact.txt", true)); 
            //write to file by objects
            for(int i = 0; i<contactList.size();i++){
               newFile.println(contactList.get(i));
            }
            
            }
         
         
         
         
            if(input == 3){
            
               System.out.print("Type contact name: ");
               String name = scan.next();
               
               System.out.print("Type age: ");
               int alder = scan.nextInt();
               System.out.print("Type phone: ");
               int phone = scan.nextInt();
               System.out.print("Type mail: ");
               String mail = scan.next();
               
            
               MyContact contact = new MyContact(name,alder,phone,mail);
            
            
               handler.addContact(contact);
               
               
               System.out.println("Contact added");
            }
         
         
            if(input == 0){
            
               break;
            
            }
         
         
            if(input >= 4){
            
               System.out.println("The menu only have 3 optional choises");
            
            }
         
         
         }
         catch(Exception e){
         
            System.out.println("Menu only takes integer...");
         
         }
      
      
      }while(true);
   }


}