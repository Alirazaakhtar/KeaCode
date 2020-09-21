
import java.util.ArrayList;

public class CreateAnimal{

   public static void main(String[]args){
   
      ArrayList<Animal> arrayObjekt = new ArrayList<Animal>();
      
      Hunter hunter = new Hunter();
      Tiger tiger = new Tiger("Tiger", 50, 4);
   
      arrayObjekt.add(new Spider("Spider",3,8));
      arrayObjekt.add(new Elefant("Elefant", 5, 4));
      arrayObjekt.add(tiger);
   
      for(int i = 0; i < arrayObjekt.size();i++){
      
         hunter.digest(arrayObjekt.get(i));
         
      }
      
      tiger.dance();
      
      //det skal være en metode fra superklassen som man kan bruge i arrayList
      arrayObjekt.get(2).getAge();
   
   
   /*
      Hunter ali = new Hunter();
      
      Animal dyr = new Animal("Dyr", 5, 4);
      
      Animal [] array1 = new Animal[3];
      
      array1 [0] = new Animal("Animal",5, 4);
      array1[1] = new Spider ("Spider",2,8);
      array1[2] = new Elefant ("Elefant",2,4);
      
      for(int i = 0; i<array1.length; i++){
      
      ali.digest(array1[i]);
      
      }
   */
   
   /*
   //Polymophisme
   
      Animal [] array = new Animal[3];
   
      array[0] = new Spider();
      array[1] = new Elefant();
      array[2] = new Animal();
   
      for(int i = 0; i<array.length;i++){
      
         array[i].eat();
      
      }
      
      array[1].run();
   
   
   */
   }


}