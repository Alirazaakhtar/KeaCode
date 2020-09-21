import javax.swing.JOptionPane;
public class Plus {

   public static void main(String[] args) {
   
   
   
   
   
      String first = JOptionPane.showInputDialog("Type the first number ");
      String second = JOptionPane.showInputDialog("Type second number ");
   
      int num1 = Integer.parseInt(first);
      int num2 = Integer.parseInt(second);
      int sum = num1 + num2;
   
      JOptionPane.showMessageDialog(null, "The answer is " + sum, "Caculater", JOptionPane.PLAIN_MESSAGE );
   
   
   
   }
}
