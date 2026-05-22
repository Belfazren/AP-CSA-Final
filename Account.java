public class Account {

    private String owner = "";
    private int balance = 0;
    private int accNumber;
    private String accType = "";

    // account constructor
    public Account(String o, int b, int aN, String aT) {
        owner = o;
        balance = b;
        accNumber = aN;
        accType = aT;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }

        return false;
    }

}