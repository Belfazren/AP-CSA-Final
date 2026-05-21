public class Account {

    private String owner = "";
    private int balance = 0;
    private int accNumber;
    private String accType = "";

    public Account(String o, int b, int aN, String aT) {
        owner = o;
        balance = b;
        accNumber = aN;
        accType = aT;
    }

    public int getAccNumber() {
        return accNumber;
    }

}