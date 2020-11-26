package Composite;

public class VP implements Corporate {

    private String name;


    public VP(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("name: " + name);
    }
}
