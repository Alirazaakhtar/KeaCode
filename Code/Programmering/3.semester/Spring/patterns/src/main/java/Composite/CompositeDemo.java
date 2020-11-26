package Composite;

public class CompositeDemo {
    public static void main(String[] args) {
       new CompositeDemo();
    }


    public CompositeDemo(){
        Corporate corporation = new Corporation("KEA");
        Corporate salesDivision = new Division("Sales");
        Corporate marketingDivition = new Division("Marketing");
        salesDivision.add(new VP("Ole"));
        salesDivision.add(new VP("Anna"));
        marketingDivition.add(new VP("Jens"));
        marketingDivition.add(new VP("Rebekka"));

        corporation.add(salesDivision);
        corporation.add(marketingDivition);

        corporation.print();


    }
}
