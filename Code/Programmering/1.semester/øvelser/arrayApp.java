import java.util.ArrayList;
import java.util.Scanner; 

public class arrayApp{

   public static void main(String[]args){
   
      Scanner scan = new Scanner(System.in);
   
   
   System.out.print("Hvor mange antal dage ønsker du vejr udsigt?: ");
      int dage = scan.nextInt(); 
      
      int [] array = new int[dage];
      
      temp(array);
   
   }

   public static void temp(int[]x){
   
      Scanner scan = new Scanner(System.in);
      
     
      
       double sum = 0; 
       double average = 0;
       int above = 0;
      
      for(int i = 0; i<x.length;i++){
      
      System.out.println("Indtast temperaturen for dag " + (i+1) + ": ");
         x[i] = scan.nextInt();
      
      sum+=x[i];
      average = (double)sum/x.length;
      
      if(x[i] > average){
      
      above++;
      
      }
      
      }
   
   System.out.println("Average: " + average);
   
   System.out.println("Above average: " + above);
   
   }





 /*
       public static void main (String[]args){
   
      ArrayList<Integer> myArray = new ArrayList<Integer>();
      Scanner scan = new Scanner(System.in);
   
   
   // lav en array med vejret og gennemsnits temperatur
   
   
      System.out.print("Hvor mange antal dags vejr udsigt?: ");
      int antalDage = scan.nextInt();
   
      int [] temp = new int[antalDage];
      
      int sum = 0;
      for(int i = 0; i < temp.length;i++){
         System.out.print("Dag " + (i + 1) + " temperatur er ");
      
         temp[i] = scan.nextInt();
      
         sum+=temp[i];
      
      }
   
      double average = (double)sum/temp.length;
      
      System.out.println("The average temperatur is: " + average);
   
   }*/
   
}