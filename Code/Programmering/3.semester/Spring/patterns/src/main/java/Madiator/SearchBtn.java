package Madiator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchBtn extends JButton implements ActionListener, Colleague {

    private  IMediator mediator;

    public SearchBtn(String text, IMediator m) {
        super(text);
        mediator = m;
        setFocusable(false);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setEnabled(false);
        System.out.println("tryk på knap");

    }

    @Override
    public void callMediator() {

    }
}
