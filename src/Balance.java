package src;

import java.util.Scanner;

public class Balance {
    private double balance = 0.0;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void payToSomeone() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter recipient's phone number: ");
        String phoneNumber = scanner.next();
        System.out.print("Enter amount to pay: ");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Paid " + amount + " to " + phoneNumber + ". New Balance: " + balance);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }
}
