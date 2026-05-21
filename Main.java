import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();

        boolean running = true;

        while (running) {
            System.out.println("===== Bank Account Manager =====");
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.println("");
                System.out.print("Enter owner name: ");
                String owner = input.nextLine();

                System.out.println("");
                System.out.print("Enter starting balance: $");
                int balance = input.nextInt();
                input.nextLine();

                System.out.println("");
                System.out.print("Enter account type: ");
                String type = input.nextLine();

                bank.createAccount(owner, balance, type);
            } 
            else if (choice == 2) {
                bank.deleteAccount(input);
            } 
            else if (choice == 3) {
                System.out.println("Goodbye.");
                running = false;
            } 
            else {
                System.out.println("Invalid option.");
            }
        }

        input.close();
    }
}