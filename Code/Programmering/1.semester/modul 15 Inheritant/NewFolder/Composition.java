import javax.swing.JOptionPane;

public class Composition{

   public static void main(String[]args){
   
   
      Laks date = new Laks(1,2,1998);
   
      Person p1 = new Person("Ali", date);
      
      System.out.println(p1);
      
      String first = JOptionPane.showInputDialog("Enter first number");
      String second = JOptionPane.showInputDialog("Enter second number");
   
   int num1 = Integer.parseInt(first);
   int num2 = Integer.parseInt(second);
   int sum = num1 + num2;
   
   JOptionPane.showMessageDialog(null, "The answer is " + sum, "Calculater", JOptionPane.PLAIN_MESSAGE);
      
   }


}