import House.*;
public class BuildHouse{


   public static void main(String [] args){
   
   Hus newHome = new Hus();
   
   
   newHome.setWindows(5);
   newHome.setDoors(5);
   newHome.setColor("Red");
   
   System.out.println("House information: Windows = " + newHome.getWindows() + ", Doors = " + newHome.getDoors());
   
   System.out.println("Home color: " + newHome.getColor());
   
   
   }



}