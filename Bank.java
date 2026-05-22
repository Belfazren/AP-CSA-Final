import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private ArrayList<Account> accounts;
    
    public Bank() {
        accounts = new ArrayList<Account>();
    }
    
    // creates accounts
    public void createAccount(String owner, int balance, String type) {
        int number = (int)(Math.random() * 90000) + 10000;

        Account newAccount = new Account(owner, balance, number, type);

        accounts.add(newAccount);

        System.out.println("Account created successfully.");
        System.out.println("Account number: " + number + " (Remember this!)");
    }
    
    // deletes accounts
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

    // deposits money
    public void depositMoney(Scanner input) {
        System.out.println("");
        System.out.print("Enter account ID: ");
        int accountID = input.nextInt();

        System.out.print("Enter deposit amount: $");
        int amount = input.nextInt();
        input.nextLine();

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccNumber() == accountID) {
                accounts.get(i).deposit(amount);
                System.out.println("Deposit successful.");
                System.out.println("New balance: $" + accounts.get(i).getBalance());
                return;
            }
        }

        System.out.println("No account found with that ID.");
    }

    // withdraws money
    public void withdrawMoney(Scanner input) {
        System.out.println("");
        System.out.print("Enter account ID: ");
        int accountID = input.nextInt();

        System.out.print("Enter withdrawal amount: $");
        int amount = input.nextInt();
        input.nextLine();

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccNumber() == accountID) {
                if (accounts.get(i).withdraw(amount)) {
                    System.out.println("Withdrawal successful.");
                    System.out.println("New balance: $" + accounts.get(i).getBalance());
                }
                else {
                    System.out.println("Insufficient funds.");
                }

                return;
            }
        }

        System.out.println("No account found with that ID.");
    }

    // views transactions
    public void viewTransactions(Scanner input) {
        System.out.println("");
        System.out.print("Enter account ID: ");
        int accountID = input.nextInt();
        input.nextLine();

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccNumber() == accountID) {
                accounts.get(i).displayTransactions();
                return;
            }
        }

        System.out.println("No account found with that ID.");
    }

    // checks balance
    public void checkBalance(Scanner input) {
        System.out.println("");
        System.out.print("Enter account ID: ");
        int accountID = input.nextInt();
        input.nextLine();

        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccNumber() == accountID) {
                System.out.println("Current balance: $" + accounts.get(i).getBalance());
                return;
            }
        }

        System.out.println("No account found with that ID.");
    }
}