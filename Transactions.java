public class Transactions {

    private String type = "";
    private int amount = 0;
    private int balanceAfter = 0;

    // transaction constructor
    public Transactions(String t, int a, int b) {
        type = t;
        amount = a;
        balanceAfter = b;
    }

    public String toString() {
        return type + ": $" + amount + " | Balance after: $" + balanceAfter;
    }
}