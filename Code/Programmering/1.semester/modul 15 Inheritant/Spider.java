

public class Spider extends Animal{


   public Spider(String name, int age, int legs){
   
   //variablerne kalder man med ordet "super"
      super(name, age, legs);
   
   
   }

   public void jump(){
   
      System.out.println(super.getName() + " jump");
   
   }
   
   public void run(){
   
      System.out.println(super.getName() + " run fast");
   
   }
   
   public int getAge(){
   
   return super.getAge() + 5;
   
   }
   
   



}