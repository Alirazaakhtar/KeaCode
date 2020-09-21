public class InsufficientFundsException extends Exception {
    //konstruktør
    public InsufficientFundsException() {
        super("Wrong balance");
    }
}
