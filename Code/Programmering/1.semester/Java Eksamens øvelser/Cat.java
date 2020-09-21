import java.util.*;
public class Cat extends Animal{

public Cat(String name, int age){
super(name, age);
}

Random rand = new Random();

   public void eat(){
   
      System.out.println("Cat is Eating");
   
   }

   public boolean ran(){
   
   return rand.nextBoolean();
   
   }


}