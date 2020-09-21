public class Panda extends Animal{

public Panda(String name, int age){

super(name, age);

}


   public void eat(){
   
      System.out.println("Panda spiser");
   
   }

   public void swim(){
   
      super.run();
   
      System.out.println("Swim");
   
   }

}