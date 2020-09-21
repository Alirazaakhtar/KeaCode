package House;

public class Hus{

   int windows;
   int doors;
   String color; 


   public void setWindows(int windows){
   
      this.windows = windows; 
   }


   public void setDoors (int doors){
   
      this.doors = doors; 
   
   }

   public void setColor (String color){
   
      this.color = color; 
   }

//Getter 

   public int getWindows(){
   
      return windows; 
   
   }

   public int getDoors(){
   
      return doors; 
   
   }

   public String getColor(){
   
      return color;
   
   }


}