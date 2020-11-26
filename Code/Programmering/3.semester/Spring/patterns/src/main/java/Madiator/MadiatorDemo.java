package Madiator;

import javax.swing.*;

public class MadiatorDemo extends JFrame {

    public MadiatorDemo(){
        SearchBtn searchBtn = new SearchBtn("Search", new Mediator());
        BookBtn bookBtn = new BookBtn("Book");
        ViewBtn viewBtn = new ViewBtn("View");
        JPanel jPanel = new JPanel();
        Display display = new Display("Start");
        jPanel.add(searchBtn);
        jPanel.add(bookBtn);
        jPanel.add(viewBtn);
        getContentPane().add(display, "North");
        getContentPane().add(jPanel, "South");
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MadiatorDemo();
    }
}
