import java.util.ArrayList;
public class Zoo{

   public static void main(String []args){
   
      ArrayList<Animal> list = new ArrayList<Animal>();
      
     
      
      list.add(new Kanin());
      list.add(new Slange());
     
      for(int i = 0; i < list.size(); i++){
      
      list.get(i).makeSound();
   }
      
   }


}