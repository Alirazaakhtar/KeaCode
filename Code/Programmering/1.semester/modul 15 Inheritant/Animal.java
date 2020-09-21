

public class Animal{
   String name;
   int age;
   int legs;
// for at hente private variabler, så henter man dem med en getterMetode


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
   
   
   //Vi laver vores egen equal metode for at samligne objekter med hinanden.
   public boolean equals(Spider x){
   
   
      return (name == x.name) && (age == x.age) && (legs == x.legs);
   
   }





}