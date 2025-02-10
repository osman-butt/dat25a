package examples.conditionals;

import java.util.Scanner;

public class SwitchMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Print menu
        printMenu();
        // Get input from user
        int choice = scanner.nextInt();
        // Create a switch statement for all menu choices
        switch (choice) {
            case 0:
                System.out.println("Showing balance " + getBalance());
                break;
            case 1:
                System.out.println("Withdrawing money");
                break;
            case 2:
                System.out.println("Deposit money");
                break;
            case 3:
                System.out.println("Exiting ...");
                break;
            default:
                System.out.println("Not a valid input");
        }
    }

    public static void printMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("0. Show balance");
        System.out.println("1. Withdraw money");
        System.out.println("2. Deposit money");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (0-3): ");
    }

    public static int getBalance() {
        return 1000;
    }
}