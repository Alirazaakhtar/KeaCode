

public class Animal{
   String name;
   int age;
   int legs;

   public Animal(String name, int age, int legs){
   
      this.name = name;
      this.age = age; 
      this.legs = legs;
   
   }

   public void run(){
   
      System.out.println(name + " run");
   
   }

   public void eat(){
   
      System.out.println(name + " eat");
   
   }
   
   public int getAge(){
   
      return age;
   
   }
   
   public int getLegs(){
   
      return legs;
   
   }
   
   public String getName(){
   
      return name;
   
   }





}