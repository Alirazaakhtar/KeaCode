package Madiator;

import javax.swing.*;
import java.awt.*;

public class Display extends JLabel {
    public Display(String text) {
        super(text);
        setFont(new Font("Arial", Font.BOLD, 30));
    }
}
