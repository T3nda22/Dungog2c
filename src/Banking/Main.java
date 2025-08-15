package Banking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banking account = new Banking();

        account.setAccountNo(123456);
        account.setPin(1234);
        account.setInitialBalance(1000.0f);

        int attempts = 0;
        boolean loggedIn = false;

        while (attempts < 3) {
            System.out.print("Enter account number: ");
            int inputAcc = scanner.nextInt();
            System.out.print("Enter PIN: ");
            int inputPin = scanner.nextInt();

            if (account.verifyAccount(inputAcc, inputPin)) {
                loggedIn = true;
                break;
            } else {
                attempts++;
                System.out.println("Incorrect account number or PIN. Attempts left: " + (3 - attempts));
            }
        }

        if (!loggedIn) {
            System.out.println("Too many failed attempts. Exiting program.");
            scanner.close();
            return;
        }
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. View Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    account.viewBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    float deposit = scanner.nextFloat();
                    account.deposit(deposit);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    float withdraw = scanner.nextFloat();
                    account.withdraw(withdraw);
                    break;
                case 4:
                    System.out.println("Thank you for using our service.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
