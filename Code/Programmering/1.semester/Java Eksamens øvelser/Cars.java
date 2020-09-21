public class Cars{

   private String name;
   private int model; 
   private String color; 
   private int wheels; 


   public Cars(String name, int model){
   
      this.name = name;
      this.model = model;
   
      wheels = 4; 
   
   }


   public void setColor(String color){
   
      this.color = color;
   
   }
   
   
   public String getColor(){
   
      return color;
   
   }

   public String toString(){
   
      return "Car: " + name + " Model: " + model; 
   
   }

}