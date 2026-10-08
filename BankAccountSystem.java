import java.util.Scanner;

class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    // Method to deposit money
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        } 
        else {
            System.out.println("Insufficient balance!");
        }
    }

    // Method to display account details
    void displayAccountDetails() {
        System.out.println("\n--- Updated Account Details ---");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        BankAccount account = new BankAccount();

        System.out.print("Enter Account Holder Name: ");
        account.accountHolder = input.nextLine();

        System.out.print("Enter Account Number: ");
        account.accountNumber = input.nextLine();

        System.out.print("Enter Initial Balance: ");
        account.balance = input.nextDouble();

        System.out.print("Enter Deposit Amount: ");
        double depositAmount = input.nextDouble();

        account.deposit(depositAmount);

        System.out.print("Enter Withdrawal Amount: ");
        double withdrawalAmount = input.nextDouble();

        account.withdraw(withdrawalAmount);

        account.displayAccountDetails();

        input.close();
    }
}