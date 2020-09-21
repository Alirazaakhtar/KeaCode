import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist{

   static Scanner reader = new Scanner(System.in);

   static ArrayList<Integer> array = new ArrayList<Integer>();


//PROGRAM
   public static void main(String[]args){
   
   
      System.out.println("please enter an array og numbers, type in 0 when finisdh");
   
      int in = reader.nextInt(); 
      while (in != 0){
         array.add(in);
         in = reader.nextInt();
      }
              
      
      
      
      System.out.println("what number do you want to delete?");
      int del = reader.nextInt();
      for(int i = 0; i< array.size(); i++){
      
         if(array.get(i) == del){
            array.remove(i);
            //break;
         }
      }
      // Break will put us here
      
       
      // the user typed 0
      PrintArray();

      
   
   
   }
   
   // Method
   public static void PrintArray(){
   
      System.out.println("----------------------");
      
      for(int i: array){
         System.out.println(i);
      }
   
   
   }

}