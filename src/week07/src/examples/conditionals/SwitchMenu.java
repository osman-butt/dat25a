package examples.conditionals;

import java.util.Scanner;

public class SwitchMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Print menu
        // Get input from user
        // Create a switch statement for all menu choices
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