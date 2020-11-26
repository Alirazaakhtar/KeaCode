package Composite;

import java.util.ArrayList;
import java.util.List;

public class Corporation implements Corporate {

private String name;
    private List<Corporate> divisions = new ArrayList<>();

    public Corporation(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Corporation: " + name);
        divisions.forEach(div -> div.print());
    }

    @Override
    public void add(Corporate corporate) {
        divisions.add(corporate);
    }
}
