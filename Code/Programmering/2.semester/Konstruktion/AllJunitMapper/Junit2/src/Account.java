
public class Account {

    private float balance;
    private float minimumBalance = 10.00F;

    public float getBalance() {
        return balance;
    }

    public float getMinimumBalance() {
        return minimumBalance;
    }

    /*** @param amount to be deposited on account*/
    public void deposit(float amount) {
        balance = balance + amount;
    }

    // /*** @param amount to be withdrawn on account*/

    public void withdraw(float amount) {
        balance = balance - amount;
    }
    //*** @param destination account where to amount should be tranferred* @param amount to be transferred * @throws InsufficientFundsException if account doesn't have *                                  the required transfer amount*/

    public void transferFunds(Account destination, float amount) throws InsufficientFundsException {
        throw new InsufficientFundsException();
    }
}

