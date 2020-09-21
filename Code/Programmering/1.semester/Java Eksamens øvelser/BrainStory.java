public class BrainStory{

   private int num = 0;


   Story[] stories = {
   
   new Story("Du kører 200 km/t og du ser en fodgænger prøver at passerer vejen, hvad gør i?", "Du forsætter med samme hastighed", "Du sætte farten ned og stopper for fodgængeren"),
   
   new Story("Du er på vej mod et lys kryds hvor du ser en bus på højre siden af vejen, hvad gøt du?", "Du kører på venstre spor", "Du stopper bag bussen"),
   
   new Story("Du bliver stoppet af en politi betjent", "Du gør din kørekort klar", "Du Prøver at stikke af"),
   
   };
   
   public String getStory(){
   
      return stories[num].getStory();
   
   }
   
   public String getChoice1(){
   
      return stories[num].getChoice1();
   
   }
   
   
   public String getChoice2(){
   
      return stories[num].getChoice2();
   
   }
   
   
   public void nextQuestion(int choice){
   
      if(choice == 1 && num == 0 ){
         num = 1;
      }
       else if(choice == 2 && num == 0){
         num = 2;
      }
      else if(choice == 1 && num == 1){
         num = 0; 
      }
      else if(choice == 2 && num == 1){
         num = 2; 
      }
      else if(choice == 1 && num == 2){
         num = 1;
      }
      else if(choice == 2 && num == 2){
         System.out.println("RESTART");
        
      }
   
   }

public int getNum(){

return num; 

}



}