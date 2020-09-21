public class Lectuer {

   String lectuerName;
   String uddannelse;
   int age; 
   int salary = 250; 
   int forbrug; 
   int lesson = 0;  
   
   
   public void showLectuer(String lectuerName){
   
   this.lectuerName = lectuerName;
      System.out.println(lectuerName); 
   
   
   }
  
   
   


   public void giveLesson(){
   
      lesson = lesson + 1; 
      
      int totalGivenLesson = 0;
   
      if (lesson == 1){
       
         totalGivenLesson = 1;
      }
      else if(lesson == 2){
      
         totalGivenLesson = 2;
      }
      
      else if (lesson == 3){
         totalGivenLesson = 3;
      }
      
      else if (lesson == 4){
         totalGivenLesson = 4;
      }
      else if (lesson == 5){
         totalGivenLesson = 5;
      }
      else if(lesson == 6){
      
         totalGivenLesson = 6;
      }
      
      else if (lesson == 7){
         totalGivenLesson = 7;
      }
      
      else if (lesson == 8){
         totalGivenLesson = 8;
      }
      else if (lesson == 9){
         totalGivenLesson = 9;
      }
      else if (lesson == 10){
         totalGivenLesson = 10;
      }
      else{
         System.out.println("Flere end 10 lektioner");
      }
   
      System.out.println("Total lessons given by the Lectuer: " + totalGivenLesson);
   
   }
 
   public void economy(){
   
      salary = salary * lesson;
      System.out.println("Total salary per lession: "  + salary +" kr");
   
   }



} 
