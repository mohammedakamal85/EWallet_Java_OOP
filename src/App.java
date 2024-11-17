package src;

import java.util.Objects;
import java.util.Scanner;

public class App {
    private boolean exit = false;
    private final Balance balance = new Balance();

    public void run() {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();
        login.auth();

        if (!Objects.equals(login.getPassword(), "")) {
            while (!exit) {
                System.out.println("*** Welcome to E-Wallet ***");
                System.out.println("---------------------------");
                System.out.println("1. Show Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Pay To Someone");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number between 1 and 5.");
                    scanner.next();
                    continue;
                }

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> System.out.println("Your Balance: " + balance.getBalance());
                    case 2 -> {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        balance.deposit(depositAmount);
                        System.out.println("Your New Balance: " + balance.getBalance());
                    }
                    case 3 -> {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawalAmount = scanner.nextDouble();
                        balance.withdraw(withdrawalAmount);
                        System.out.println("Your New Balance: " + balance.getBalance());
                    }
                    case 4 -> balance.payToSomeone();
                    case 5 -> exit = true;
                    default -> System.out.println("Invalid choice. Please select a valid option.");
                }
            }
        }
    }
}
