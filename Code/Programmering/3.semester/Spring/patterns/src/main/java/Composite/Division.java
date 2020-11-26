package Composite;

import java.util.ArrayList;
import java.util.List;

public class Division implements Corporate {

    private String name;
    private List<Corporate> divisions = new ArrayList<>();


    public Division(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Division: " + name);
        divisions.forEach(div -> div.print());
    }



    @Override
    public void add(Corporate corporate) {
        divisions.add(corporate);
    }
}
