public class Student{

   
   private String name;
   private int phoneNumber; 
   private int sNumber; 
   private int alder;
   
   private static int alderTotal;
   private static int studentAntal; 
   

   public Student(String name, int alder, int phoneNumber, int sNumber){
   
      this.name = name; 
      this.phoneNumber = phoneNumber; 
      this.sNumber = sNumber; 
      this.alder = alder; 
   
      studentAntal = studentAntal + 1;
      alderTotal = alderTotal + alder;
   
   }
   
   public static int schoolAlder(){
   
      return alderTotal;
   
   }
   
   public static int schoolTotal(){
   
      return studentAntal;
   
   }

//Overrider, dvs. at når vi printer objektet, så printes dette
public String toString(){

return "Name: " + name + "\t Alder: " + alder; 
}





}