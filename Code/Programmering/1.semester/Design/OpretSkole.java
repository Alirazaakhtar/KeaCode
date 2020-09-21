

public class OpretSkole{

//PROGRAM

   public static void main (String[]args){
   //navn giver objektet og = opretter objektet. 
   
      Student myStudent1 = new Student("Ali", 32, 34454675, 20342);
      Student myStudent2 = new Student("Peter", 23, 34454445, 20642);
      Student myStudent3 = new Student("Jesper", 42, 54454675, 20942);
   
   
   System.out.println("StudentAntal: " + Student.schoolTotal());
   
   System.out.println("Gennemsnits alder: " + (double)Student.schoolAlder()/Student.schoolTotal());
   
   System.out.println(myStudent2);
   }

}