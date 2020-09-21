public class Bil{

   private double pris;
   private boolean erAntik;
   private int gear; 
   private String name;

//Set metoder

   public void setName(String name){
   
      this.name = name;
   }

   public void setPris (double tal){
   
      pris = tal; 
   }





   public void setAntik (boolean erAntik){
   
      this.erAntik = erAntik;
   
   }

   public void setGear(int antalGear){
   
      gear = antalGear;
   
   }

//Get Metoder

   public String getName(){
   
      return name;
   } 

   public double getPris (){
   
      return pris;
   }

   public boolean getAntik (){
   
      return erAntik;
   }

   public int getGear (){
   
      return gear;
   }

}