package src;

import java.util.Scanner;

public class Login {
    private String username;
    private String password;

    public void auth() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        username = scanner.next();
        System.out.print("Enter password: ");
        password = scanner.next();
        System.out.println("Welcome " + username);
    }

    public String getPassword() {
        return password;
    }
}
