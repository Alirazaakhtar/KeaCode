public class Spiller{

   String name; 
   
   int x; 
   int y; 

   public Spiller(String name){
   
      this.name = name; 
   
      x = 5; 
      y = 5; 
   
   }

   public void movePlayer(int x, int y){
   
      this.x = this.x + x;
      this.y = this.y + y;
   
   //begrænser x og y til 10x10
   
      if(this.x>10){
         this.x = 10;
         
         playerOutsideJungle();
      }
         
      if(this.x<0){
         this.x = 0;
         
         playerOutsideJungle();
      }
      
      if(this.y>10){
         this.y = 10;
         
         playerOutsideJungle();
      }
      if(this.y<0){
         this.y = 0;
         
         playerOutsideJungle();
      }
   
   
   }
   
   
   public void showPlayer(){
   
      System.out.println("Player is on position x = " + this.x + ", y = " + this.y + "\n");
   
   }
   
   public void playerOutsideJungle(){
   
      System.out.println("\nYOU HAVE TO STAY INSIDE THE JUNGLE 10x10");
   
   }
  




}