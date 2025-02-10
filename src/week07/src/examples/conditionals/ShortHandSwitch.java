package examples.conditionals;

import java.util.Scanner;

public class ShortHandSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printMenu();

        int choice = scanner.nextInt();

        // TODO: Update to use shorthand switch
        switch (choice) {
            case 0 -> System.out.println("Balance: 100" );
            case 1 -> System.out.println("Money withdrawn!");
            case 2 -> System.out.println("Money deposited!");
            case 3 -> {
                System.out.println("See you next time :)");
                System.out.println("Exiting ...");
            }
            default -> System.out.println("Unknown choice");
        }
        scanner.close();
    }

    public static void printMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("0. Show balance");
        System.out.println("1. Withdraw money");
        System.out.println("2. Deposit money");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (0-3): ");
    }
}