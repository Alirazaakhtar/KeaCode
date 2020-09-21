public class Story{

   private String story; 
   private String choice1;
   private String choice2; 

   Story(String story, String choice1, String choice2){
   
      this.story = story;
      this.choice1 = choice1;
      this.choice2 = choice2;
   
   }
   
   public String getStory(){
   
      return story;
   
   }
   
   public String getChoice1(){
   
      return choice1;
   
   }
   
   public String getChoice2(){
   
      return choice2;
   
   }
   



}