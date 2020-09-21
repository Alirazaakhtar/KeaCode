public class Bmw extends Cars{

   private int gear;


//Kontruktør
   public Bmw(String name, int model){
   
      super(name, model);
   
   }
   
   public void setGear(int gear){
   
      this.gear = gear; 
   
   }
   
   public int getGear(){
   
      return gear;
   
   }


}