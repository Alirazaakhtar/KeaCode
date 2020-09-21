
import java.util.ArrayList;

public class CreateAnimal{

   public static void main(String[]args){
   
      ArrayList<Animal> arrayObjekt = new ArrayList<Animal>();
      
      Animal animal = new Animal("Animal",0,0);
      Hunter hunter = new Hunter();
      Tiger tiger = new Tiger("Tiger", 50, 4);
      Spider spider = new Spider("Tiger",50,4);
      Elefant elefant = new Elefant("Elefant", 5, 4);
      arrayObjekt.add(spider);
      arrayObjekt.add(elefant);
      arrayObjekt.add(tiger);
   
      for(int i = 0; i < arrayObjekt.size();i++){
      
         hunter.digest(arrayObjekt.get(i));
         
      }
      
      arrayObjekt.get(0).eat();
      
      tiger.dance();
      
      //det skal være en metode fra superklassen som man kan bruge i arrayList
      System.out.println(arrayObjekt.get(2).getAge());
      System.out.println(arrayObjekt.get(1).getAge());
      System.out.println(arrayObjekt.get(0).getAge());
      
      if(tiger.equals(spider)){
      
         System.out.println("Equals");
      
      } else
         System.out.println("not equals");
      
      if(elefant instanceof Animal){
      
         System.out.println("true");
      
      }
   
   
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