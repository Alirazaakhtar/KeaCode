import java.util.Scanner;

public class Travler{


   private String name;
   private String land;
   private int age; 
   private int cpr; 
   private int People;


//// konstruktør
   public Travler(){
   }

/// set method

   public void setName(String name){
   
      this.name = name;
   
   }

   public void setAge(int age){
   
      this.age = age;
   
   }

   public void setCpr(int cpr){
      this.cpr = cpr;
   
   }

   public void setLand(String land){
   
      this.land = land;
   
   }
   
   public void setPeople(int People){
      this.People = People;
      
   }
   
   public void showInfo(){
   System.out.println("Travler info: ");
   System.out.println("Name: " + getName());
   System.out.println("Age: " + getAge());
   System.out.println("Cpr nr: *******");
   System.out.println("Country to travel: " + getLand());
   System.out.println("Total people: " + getPeople());
   
   }

// get method

   public String getName(){
      return name;
   }

   public int getAge(){
      return age;
   }

   public int getCpr(){
      return cpr;
   }

   public String getLand(){
      return land;
   
   }

   public int getPeople(){
      return People;
   }




}