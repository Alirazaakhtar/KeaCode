//Java grafiske bruger elementer
import javax.swing.*; 
import java.awt.FlowLayout;
import java.awt.event.ActionListener;


// implements ActionListener, så vi kan lyt på hvad der sker på kode 46

public class GameFrame extends JFrame implements ActionListener {

   Gamedata game;


//Konstruktør
   public GameFrame(String title){
      super(title);
      //Layout manager, laver størrelsen på firkant man kan skrive i
      getContentPane().setLayout(new FlowLayout());
      
      addComponents();
      
      //Start game
      game = new Gamedata();
               
   //Så vi ren faktisk kan se den (true)
      setVisible(true);
   //Gør at når vi lukker vores frame, så skal vores program stoppe med kører. ellers kører den bare
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

//private metoder
   private void addComponents(){
   
   //Add components
         
      JLabel tries = new JLabel ("Forsøg: ");
      getContentPane().add(tries);
      
      
        //reprænsenterer tekst felte
      JTextField inputField = new JTextField(8);
      //jeg ønsker at snakke med den del af frame som skal indeholde vore knapper osv
      getContentPane().add(inputField);
      
      
      JButton submitGuess = new JButton ("Gæt tal");
      submitGuess.addActionListener(this);
      getContentPane().add(submitGuess);
      
      //Sætter tekst til at starte med
      JLabel gameAnswer = new JLabel("For højt");
      getContentPane().add(gameAnswer);
      
   }
  
  
  
   public void actionPerformed(ActionEvent e){
   
      
   
   
   }


}