public class ToString{

   private int month; 
   private int day; 
   private int year;
   private String name;

   public ToString(int day, int month, int year, String name){
      this.month = month; 
      this.day = day; 
      this.year = year;
      this.name = name; 
   
   // this = en refference til det objekt vi bygger
   //System.out.printf("the construkør for this is %s\n", this);
   
   }

public String toString(){

return String.format("%d/%d/%d", day, month, year);

}

}