import java.util.*;
public class ControlCenterFile{

   public static void main(String []args){
   
      ArrayList<String> fileName = new ArrayList<String>();
      ArrayList<FileHolder> filer = new ArrayList<FileHolder>();
      
      FileHolder fileHolder = new FileHolder();
   
      do{
         try{
         
         
         
         
            System.out.println("\nWelcome to FileManagement:");
            System.out.println("1.Create a file");
            System.out.println("2.Write to file");
            System.out.println("3.Open file");
            System.out.println("4.Transfer file data to ArrayList");
            System.out.println("5.Delete file");
            System.out.println("0.Exit program");
         
         
         
         
            Scanner scan = new Scanner(System.in);
            System.out.print("Type a number to continue: ");
            int input = scan.nextInt();
         
         
            if(input == 1){
            
               System.out.print("Create name of the file you want to create?: ");
               String name = scan.next();
               fileName.add(name);
               
               fileHolder.createFile(name);
            
            }
         
            if(input == 2){
            
               System.out.println("\nList of files:");
               for(int i = 0; i < fileName.size();i++){
                  System.out.println((1+i) + "." + fileName.get(i));
               
               }
               
               System.out.print("Type file name: ");
               String name = scan.next();
               fileHolder.writeFile(name);
               
               
            }
            
            if(input == 3){
            
               System.out.println("\nList of files:");
               for(int i = 0; i < fileName.size();i++){
                  System.out.println((1+i) + "." + fileName.get(i));
               
               }
            
            
               System.out.print("\nType the name of the file: ");
               String name = scan.next();
               fileHolder.printFile(name);
            
            }
         
         
            if(input == 4){
            
               System.out.println("\nList of files:");
               for(int i = 0; i < fileName.size();i++){
                  System.out.println((1+i) + "." + fileName.get(i));
               
               }
            
            
               System.out.print("\nType the name of the file: ");
               String name = scan.next();
               
               FileHolder fileh = new FileHolder();
            
               filer.add(fileh);
            
               fileh.readFileArray(name);
            
            
            }
            
            if(input == 5){
            
            
               System.out.println("\nList of files:");
               for(int i = 0; i < fileName.size();i++){
                  System.out.println((1+i) + "." + fileName.get(i));
               
               }
            
               System.out.print("Type file name: ");
               String name = scan.next();
               fileHolder.deleteFile(name);
               
               fileName.remove(name);
               
            
            }
           
         
            
            
            if(input == 0){
            
               break;
            
            }
            if(input > 5){
               System.out.println("The menu only have 5 optional");
            
            }
         
         
         
         
         
            
         
         
         
         }
         catch(Exception e){
         
            System.out.println("The menu only takes integer... Please try again");
         
         }
      
      }while(true);
   }




}