public class Bog {

   private String name; 
   private int sider;
   private double pris; 
   private String biblotek;
   
   //Kontruktør
   public Bog(String name, int sider, double pris, String biblotek){
      
      this.name = name;
      this.sider = sider;
      this.pris = pris;
      this.biblotek = biblotek;
   
   
   }
   //ny konstruktør som bruger hoved konstruktør 
   //"this" tager alle de samme varibler fra første konstruktør
   public Bog (){
   
   this("ninja", 20, 100, "taastrup");
   
   showInfo();
   
   }
   

//Set metoder

   public void setName(String name){
   
      this.name = name;
      
     
   }


   public void setSider (int sider){
   
      this.sider = sider;
   
   }

   public void setPris(double pris){
   
      this.pris = pris; 
      //showInfo();
   }
// Get metoder

   public String getName(){
   
      return name;
   }

   public int getSider (){
   
      return sider;
   
   }

   public double getPris(){
   
      return pris;
   }

//metoder 
   public void showInfo(){
   
      System.out.println("Biblotek " + biblotek + " Info:\nName: " + name + "\nSider: " + sider + "\nPris: " + pris);
   
   }


}

