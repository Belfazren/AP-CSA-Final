import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<Account>();
    }

    public void createAccount(String owner, int balance, String type) {
        int number = (int)(Math.random() * 90000) + 10000;

        Account newAccount = new Account(owner, balance, number, type);

        accounts.add(newAccount);

        System.out.println("Account created successfully.");
        System.out.println("Account number: " + number + " (Remember this)");
    }

    public void deleteAccount(Scanner input) {
        System.out.println("");
        System.out.print("Enter account ID to delete: ");
        int accountID = input.nextInt();
        input.nextLine();

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccNumber() == accountID) {
                accounts.remove(i);
                System.out.println("Account deleted successfully.");
                return;
            }
        }

        System.out.println("No account found with that ID.");
    }
}