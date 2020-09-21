public class Stove {

//private er så variable kun kan bruges i metoderne. 

   private int voltage; 
   
   
   
   Flame flame1 = new Flame();
   Flame flame2 = new Flame();
   Flame flame3 = new Flame();
   Flame flame4 = new Flame();
 
 
    //Konstruktør 
//Sætter en uændret værdi f.eks. når man køber et mikroovn, så har den en fast volt 
   public Stove(){
      voltage = 220;
   }

//konstruktør - overloading
   public Stove(int newVoltage){
   
      voltage = newVoltage;
   
   }
 

   public void showStatusBefore(){
   
      int  level1 = 0; 
      int  level2 = 0; 
      int  level3 = 0; 
      int  level4 = 0;
   
   
   
      System.out.println("The voltage is set to: " + voltage + " V \n");
      
      System.out.println("Status: \n");
      flame1.cooking(level1, "Blus1");
      flame2.cooking(level2, "Blus2");
      flame3.cooking(level3, "Blus3");
      flame4.cooking(level4, "Blus4");
      
      System.out.println("\n");
   
   
   }
   
   public void showStatusAfter(){
   
      System.out.println("Status: \n");
   
      int  level1 = 0;
      int  level2 = 0;
      int  level3 = 10;
      int  level4 = 2;
   
      flame1.cooking(level1, "Blus1");
      flame2.cooking(level2, "Blus2");
      flame3.cooking(level3, "Blus3");
      flame4.cooking(level4, "Blus4");
   
   
   }
   
    




}