import java.util.*;
public class Menu{

   Scanner scan = new Scanner(System.in);
   
   FileHolder fileHolder = new FileHolder();
   
   MemberList list = new MemberList();

   
   //ArrayList<String> competetiveList = new ArrayList<String>();
   //ArrayList<String> motionistList = new ArrayList<String>();


   public void menuManager(){
   
   //Loader navne i arrayList fra fil
      list.loadFile();
      
   
      while(true){
      
         Login login = new Login("Manager", "1234");
      
         System.out.println("\n|Please Enter Login|");
         System.out.print("Enter username: ");
         String username = scan.next();
      
         System.out.print("Enter password: ");
         String password = scan.next();
      
         if( username.equals(login.getUsername()) && password.equals(login.getPassword())){
         
            do{
            
            
            
               System.out.println("\n|Delfin Menu| ");
               System.out.println("----------------------------------------------------------");
               System.out.println("|1.Create member                                         |");
               System.out.println("|2.Edit member                                           |");
               System.out.println("|3.Delete member                                         |");
               System.out.println("|4.List of members                                       |");
               System.out.println("|5.List of contingent for members                        |");
               System.out.println("|6.Register results                                      |");
               System.out.println("|7.List of results                                       |");
               System.out.println("|8.Edit results                                          |");
               System.out.println("----------------------------------------------------------");
               System.out.println("|0.Exit menu                                             |");
               System.out.println("----------------------------------------------------------");
            
               try{
                  
                 
                  // bruges i menu 1
                  Motionist motionist = new Motionist();
                  // -=-
                  CompetetiveSwimmer competetive = new CompetetiveSwimmer();
               
               
               
               
                  Scanner input = new Scanner(System.in);
                  System.out.print("Type a number?: ");
                  int menuNumber = input.nextInt();
               
               //Create member
                  if(menuNumber == 1){
                  
                     System.out.println("\nWhich activity form does the member wants to register? \n1.Motionist\n2.Competetiveswimmer");
                     System.out.print("Type a number: ");
                     int activity = input.nextInt();
                  
                     if(activity  == 1){
                     
                     
                        motionist.createMember();
                        
                        //Add name to list
                        
                        list.addMotionist(motionist.getName());
                                             
                     }
                     else if(activity == 2) {
                        
                          //Add name to list
                        competetive.createMember();
                        
                        list.addCompetetive(competetive.getName());
                        
                     }
                     else
                        System.out.println("Wrong input, Please try again");
                  
                   
                  
                  }
                  
                  //Edit member 
                  if(menuNumber == 2){
                  
                                    
                    // printer listen ud for motionist og com...
                     //kommer fra MemberList klassen
                     list.getMotionist();
                     list.getCompetetive();                       
                  
                     //fileHolder = new FileHolder();
                  
                     if(fileHolder.readFile()){
                     
                        fileHolder.replacement();
                        
                        fileHolder.writeToFile();
                     
                     }
                  
                  
                  
                  }
               
                  if(menuNumber == 3){
                  
                     // printer listen ud for motionist og com...
                     //kommer fra MemberList klassen
                     list.getMotionist();
                     list.getCompetetive();                
                                          
                  
                     //fileHolder = new FileHolder();
                  
                     System.out.print("Type the name of the Member you want to delete: ");
                     String name = scan.nextLine();
                  
                     fileHolder.deleteFile(name);
                  
                  }
               
                  if(menuNumber == 4){
                  
                                       
                     System.out.println("List of members: ");
                     // printer listen ud for motionist og com...
                     //kommer fra MemberList klassen
                     list.getMotionist();
                     list.getCompetetive();                  
                  //print the member info on console....
                  
                     System.out.print("\nType name of the member you want to see info of: ");
                     String name = input.next();
                     fileHolder.printMember(name);   
                  
                  }
               
                  if(menuNumber == 5){
                  
                  
                  }
               
                  if(menuNumber == 6){
                  
                  
                  }
               
                  if(menuNumber == 7){
                  
                  
                  }
               
                  if(menuNumber == 8){
                  
                  
                  }
                  if(menuNumber == 0){
                  
                     break;
                  
                  }
               
                  if(menuNumber > 8){
                  
                     System.out.println("The menu only have 0-8 options! Please choose the accessible options:\n");
                  
                  }
               
               }
               catch(Exception e){
               
               
                  System.out.println("The menu only takes integers. Try Again!\n");
               
               
               }
            
            
            
            
            
            }while(true);
                     
         }
         
         
         // når vi trykker på 0, så skal vi også breakke fra den anden loop
         break;
      
      
      }
      
   
   
   
   }
   
   

   public void menuCashier(){
   
   
   
      while(true){
      
         Login login = new Login("Cashier", "5678");
      
         System.out.println("\n|Please Enter Login|");
         System.out.print("Enter username: ");
         String username = scan.next();
      
         System.out.print("Enter password: ");
         String password = scan.next();
      
         if( username.equals(login.getUsername()) && password.equals(login.getPassword())){
         
            do{
            
            
               System.out.println("\n|Delfin Menu| ");
               System.out.println("----------------------------------------------------------");
               System.out.println("|1.List of contingent of members                        |");
               System.out.println("|2.List of members in restance                           |");
               System.out.println("----------------------------------------------------------");
               System.out.println("|0.Exit menu                                             |");
               System.out.println("----------------------------------------------------------");
            
               try{
               
                  Scanner input = new Scanner(System.in);
                  System.out.print("Type a number?: ");
                  int menuNumber = input.nextInt();
               
                  if(menuNumber == 1){
                  
                  
                  }
                  if(menuNumber == 2){
                  
                  
                  }
               
                  if(menuNumber == 0){
                  
                     break;
                  
                  }
               
                  if(menuNumber > 2){
                  
                     System.out.println("The menu only have 0-2 options! Please choose the accessible options:\n");
                  
                  }
               
               }
               catch(Exception e){
               
               
                  System.out.println("The menu only takes integers. Try Again!\n");
               
               
               }
            
            
            
            
            
            }while(true);
                     
         }
         
         
         // når vi trykker på 0, så skal vi også breakke fra den anden loop
         break;
      
      
      }
      
   
   
   
   
   }
   
   

   public void menuTrainer(){
   
   
   
   
      while(true){
      
         Login login = new Login("Trainer", "9876");
      
         System.out.println("\n|Please Enter Login|");
         System.out.print("Enter username: ");
         String username = scan.next();
      
         System.out.print("Enter password: ");
         String password = scan.next();
      
         if( username.equals(login.getUsername()) && password.equals(login.getPassword())){
         
            do{
            
            
               System.out.println("\n|Delfin Menu| ");
               System.out.println("----------------------------------------------------------");
               System.out.println("|1.List of results                                       |");
               System.out.println("|2.Edit results                                          |");
               System.out.println("|3.Register results                                      |");
               System.out.println("----------------------------------------------------------");
               System.out.println("|0.Exit menu                                             |");
               System.out.println("----------------------------------------------------------");
            
               try{
               
                  Scanner input = new Scanner(System.in);
                  System.out.print("Type a number?: ");
                  int menuNumber = input.nextInt();
               
                  if(menuNumber == 1){
                  
                  
                  }
                  if(menuNumber == 2){
                  
                  
                  }
               
                  if(menuNumber == 3){
                  
                  
                  }
               
                  if(menuNumber == 0){
                  
                     break;
                  
                  }
               
                  if(menuNumber > 3){
                  
                     System.out.println("The menu only have 0-3 options! Please choose the accessible options:\n");
                  
                  }
               
               }
               catch(Exception e){
               
               
                  System.out.println("The menu only takes integers. Try Again!\n");
               
               
               }
            
            
            
            
            
            }while(true);
                     
         }
         
         
         // når vi trykker på 0, så skal vi også breakke fra den anden loop
         break;
      
      
      }
      
   }
   

}