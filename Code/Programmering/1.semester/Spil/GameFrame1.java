import javax.swing.*;
import java.awt.FlowLayout;
import java.util.ArrayList; 
import java.util.Scanner; 

   

public class GameFrame1 extends JFrame {


   public GameFrame1(String title){
      super(title);
   
   //Layout manager
      getContentPane().setLayout(new FlowLayout());
   
      addComponents();
   
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   
   }

   private void addComponents(){
   //  laver tekst på skærmen.
      JLabel tries = new JLabel("Forsøg");
      getContentPane().add(tries);
   
   //text og størelsen af det sted tekstens skal stå
      JTextField inputField = new JTextField(14);
      getContentPane().add(inputField);
      
      // vores knap
      JButton guess = new JButton("Gæt tal");
      getContentPane().add(guess);
      
      JLabel gameAnswer = new JLabel("For højt");
      getContentPane().add(gameAnswer);
     
   }

   
}

