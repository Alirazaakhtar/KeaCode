import java.util.Scanner;

public class Student{

   String studentName; 
   int age; 
   String klasse; 
   int fagLektioner = 0;
   int su;
   double forbrug;
   
   
   Lectuer myLectuer = new Lectuer();
   
   Scanner type = new Scanner(System.in);
   
   
   public void showLectuer(String name){
   
  System.out.println("Lectuer name is: " + name);
   
   }
   
   public void showStudent(){
   
      System.out.print("Type name: ");
      studentName = type.nextLine();
      
      System.out.print("Type age: ");
      age = type.nextInt();
      
      System.out.println("Student info:\n"  + studentName + " \n" + age + " år" );
   
   }

   public void addLesson(){
   
      System.out.println("Indtast lektion antal: ");
      fagLektioner = type.nextInt(); 
     
      int totalLesson = 0;
     
      switch(fagLektioner){
      
         case 1:
            totalLesson = 1;
            break;
            
         case 2: 
            totalLesson = 2; 
            break;
        
         case 3: 
            totalLesson = 3;
            break; 
        
         case 4:
            totalLesson = 4; 
            break; 
        
         case 5:
            totalLesson = 5;
            break; 
        
         case 6:
            totalLesson = 6;
            break;
            
         case 7: 
            totalLesson = 7; 
            break;
        
         case 8: 
            totalLesson = 8;
            break; 
        
         case 9:
            totalLesson = 9; 
            break; 
        
         case 10:
            totalLesson = 10;
            break; 
            
         default: 
            totalLesson = fagLektioner;
            //System.out.println("More then 10 lessons");
      
        
      }
      System.out.println("Antal lektioner gennemført: " + totalLesson);
   
   
   }
   
    

   public void economy(){
   
      su = 5500;
      forbrug = 2500; 
   
      double overskud = su - forbrug; 
   
      System.out.println("Eleven " + studentName + " får SU som svare til " + su + " og har et forbrug på " + forbrug + ". Derfor har eleven et overskud på " + overskud);
   
   }

}