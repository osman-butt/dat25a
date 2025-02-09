package examples.conditionals;

import java.util.Scanner;

public class TernaryExample {
    public static void main(String[] args) {
        // Correct Usernames and passwords
        final String CORRECT_ADMIN_USERNAME = "admin";
        final String CORRECT_ADMIN_PASSWORD = "1234";
        final String CORRECT_EMPLOYEE_USERNAME = "employee";
        final String CORRECT_EMPLOYEE_PASSWORD = "1234";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        // Check if admin (boolean)
        boolean isAdmin = username.equals(CORRECT_ADMIN_USERNAME) && password.equals(CORRECT_ADMIN_PASSWORD);
        // Check if employee (boolean)
        boolean isEmployee = username.equals(CORRECT_EMPLOYEE_USERNAME) && password.equals(CORRECT_EMPLOYEE_PASSWORD);

        // TODO:
        // - Rewrite everything using ternary operator

        // Nested if-else (Check if logged in (if admin else) else wrong user)
        if (isAdmin || isEmployee) {
            if (isAdmin) {
                System.out.println("Hello admin");
            } else {
                System.out.println("Hello employee");
            }
        } else {
            System.out.println("Wrong credentials!");
        }
    }
}
