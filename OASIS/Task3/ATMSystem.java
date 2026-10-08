package Task3;

import java.util.Scanner;

// Class to represent the user's bank account
class BankAccount {

    private double balance;
    private int pin;

    // Constructor
    public BankAccount(double balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }

    // Verify PIN
    public boolean verifyPin(int enteredPin) {
        return pin == enteredPin;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }

    // Check balance
    public double getBalance() {
        return balance;
    }
}

// ATM class
class ATM {

    private BankAccount account;

    // Constructor
    public ATM(BankAccount account) {
        this.account = account;
    }

    // ATM menu
    public void start() {

        Scanner sc = new Scanner(System.in);

        // PIN authentication
        boolean authenticated = false;

        for (int attempt = 1; attempt <= 3; attempt++) {

            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();

            if (account.verifyPin(enteredPin)) {
                authenticated = true;
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Incorrect PIN!");

                if (attempt < 3) {
                    System.out.println(
                        "Attempts remaining: " + (3 - attempt)
                    );
                }
            }
        }

        // Stop if authentication failed
        if (!authenticated) {
            System.out.println("Too many incorrect attempts.");
            System.out.println("Your account has been locked.");
            sc.close();
            return;
        }

        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println(
                        "Current Balance: ₹ " + account.getBalance()
                    );
                    break;

                case 2:
                    System.out.print(
                        "Enter amount to deposit: ₹ "
                    );

                    double depositAmount = sc.nextDouble();

                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print(
                        "Enter amount to withdraw: ₹ "
                    );

                    double withdrawAmount = sc.nextDouble();

                    account.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println(
                        "Thank you for using the ATM!"
                    );
                    break;

                default:
                    System.out.println(
                        "Invalid choice! Please try again."
                    );
            }

        } while (choice != 4);

        sc.close();
    }
}

// Main class
public class ATMSystem {

    public static void main(String[] args) {

        // Initial balance = ₹10000
        // PIN = 1234
        BankAccount account = new BankAccount(10000, 1234);

        // Connect ATM with Bank Account
        ATM atm = new ATM(account);

        // Start ATM
        atm.start();
}
}