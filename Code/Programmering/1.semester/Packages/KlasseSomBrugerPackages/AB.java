//Henter packages og klasser 
import myPackageA.ClassA;
import myPackageB.ClassB;

public class AB {


   public static void main(String[]args){
   
   //OPretter objekter af klasser
      ClassA myA = new ClassA();
   
      ClassB myB = new ClassB();
      
      // kalder metoderne fra objekterne
   
      myA.doOne();
      
      myB.doTwo();
   
      myB.doThree();
   
   }



}