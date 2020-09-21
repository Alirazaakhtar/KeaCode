public class Elefant extends Animal{


   public Elefant(String name, int age, int legs){
   
      super(name, age, legs);
   
   
   }


   public void eat(){
   
      System.out.println(super.getName() + " is eating banana " );
   
   
   }
   
   public void run(){
   
      System.out.println("Can't run");
   
   }



}