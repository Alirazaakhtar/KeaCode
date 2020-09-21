public class Kontingent{

   private int kontingentJunior;
   private int kontingentSenior;
   private int kontingentPension;
   
   public Kontingent(){
      kontingentJunior = 1000;
      kontingentSenior = 1600;
      kontingentPension = kontingentSenior -400;
   
   
   }
   
       
   
    
   public int kontingent(int age){
   
   
   
      if (age < 18){
         return kontingentJunior;
      }
      else if (age > 18 && age <60){
         return kontingentSenior;
      }
      else{
         return kontingentPension;
      }
   
   }

   



}