public class Motorcykel {

//METODER

   String maerke = "Yamaha";
   String model = "pikanto";
   int årgang = 2016;
   double hastighed = 2016; 

   public void hastighed(){
   
      System.out.println(hastighed + " km/t");
   } 
   
   public void loop(){
   
      double i = hastighed; 
   
      while (i < 240){
         i++;
         System.out.println(i + " km/t");
      
      }
   
   
   }
   
   public void forloop(){
   
      for(int i = 0; i <=10; i+=2){
         System.out.println(i);
      }
   
   }
   
   public void iff (){
   
   
      if (årgang < hastighed){
      
         System.out.println("rigtigt");
      }
      else if(årgang > hastighed){
      
         System.out.println("tjek");
      }else{
         System.out.println("???");
      }
      
   }

   public void swit(){
   
      int x = 5;
   
      switch(x){
      
         case 1:
            System.out.println("x = 1");
            break;
      
         case 2:
            System.out.println("x = 2");
            break;
      
         case 3:
            System.out.println("x = 3");
            break;
      
         case 4:
            System.out.println("x = 4");
            break;
      
         default:
            System.out.println("ingen");
      
      }
   
   
   }


}