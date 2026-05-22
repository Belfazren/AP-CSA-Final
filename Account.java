import java.util.ArrayList;

public class Account {

    private String owner = "";
    private int balance = 0;
    private int accNumber;
    private String accType = "";
    private ArrayList<Transactions> transactions;

    // account constructor
    public Account(String o, int b, int aN, String aT) {
        owner = o;
        balance = b;
        accNumber = aN;
        accType = aT;
        transactions = new ArrayList<Transactions>();
    }

    public int getAccNumber() {
        return accNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
        transactions.add(new Transactions("Deposit", amount, balance));
    }

    public boolean withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add(new Transactions("Withdrawal", amount, balance));
            return true;
        }

        return false;
    }

    public void displayTransactions() {
        if (transactions.size() == 0) {
            System.out.println("No transactions found.");
        }
        else {
            for (int i = 0; i < transactions.size(); i++) {
                System.out.println(transactions.get(i));
            }
        }
    }

}