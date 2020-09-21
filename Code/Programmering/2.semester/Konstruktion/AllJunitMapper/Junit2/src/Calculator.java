public class Calculator {

    public boolean isEven(int n) {
        if (n > 1000 || n <= 0) {
            throw new IllegalArgumentException();
        }
        return true;
    }

}
