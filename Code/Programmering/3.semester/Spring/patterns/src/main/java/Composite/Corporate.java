package Composite;

public interface Corporate {
    void print();

    //hvis man vil, så kan man have den med
    default void add(Corporate corporate){};
}
