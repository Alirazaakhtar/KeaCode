import java.util.ArrayList;
public class Test1{

   public static void main(String[]args){
   
      ArrayList<Animal> animals = new ArrayList<Animal>();
      
      animals.add(new Cat("Cat", 30));
      animals.add(new Panda("Panda", 20));
   
      for(int i =0; i < animals.size(); i++){
      
         animals.get(i).getInfo("age");
      
      }
   
      
   
   }


}