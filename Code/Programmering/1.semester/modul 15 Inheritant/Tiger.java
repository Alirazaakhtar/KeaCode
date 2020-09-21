public class Tiger extends Animal{

   public Tiger(String name, int age, int legs){
   
      super(name, age, legs);
   
   
   }
   
   
   public void dance(){
   
   //Her henter jeg metoden fra supper klassen
      super.eat();
      super.run();
   
   
   }





}