package Madiator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookBtn extends JButton implements ActionListener {

    public BookBtn(String text) {
        super(text);
        setFocusable(false);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("tryk på knap");
    }
}