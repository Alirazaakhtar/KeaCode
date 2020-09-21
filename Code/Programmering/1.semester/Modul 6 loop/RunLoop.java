public class RunLoop{

// Program

   public static void main(String []args){
   
      Terning nyTerning = new Terning();
    
    int age = 60;
    
    //System.out.println(age >50 ? "true" : "false");
     
     for(int kast = 0; kast<10; kast++){
     
     nyTerning.kastTerning();
     System.out.println("Kast nr: "+ kast + "\t" + "Slået = " + nyTerning.getTerning());
    
     }
 
     
   /*
      for(int spil = 1; spil<=10; spil++){
      System.out.println("Antal Spil: " + spil);
         for(int kast = 1; kast <= 3; kast++){
          nyTerning.kastTerning();
           System.out.println("kast =" + nyTerning.getTerning());
         }
         
         
      
      }
   */
   
   }
   
}