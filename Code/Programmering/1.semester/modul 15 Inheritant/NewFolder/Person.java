public class Person {

   String name;
   Laks date;

   public Person(String name, Laks date){
   
      this.name = name;
      this.date = date;
   
   }

public String toString(){

return String.format("%s har birthday on %s", name, date);

}



}