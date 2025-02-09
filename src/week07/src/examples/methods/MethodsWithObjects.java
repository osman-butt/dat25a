package examples.methods;

import java.util.Scanner;

public class MethodsWithObjects {
    public static void main(String[] args) {
        // Create scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvad er dit navn? ");
        String name = scanner.nextLine();

        System.out.println("Hvor gammel er du? ");
        int age = scanner.nextInt();

        System.out.println("Hej " + name + "! Du er " + age + " år gammel.");

        // Pass object to getName
        // Pass object to getAge
        // Pass name and age to printGreeting
        scanner.close();
    }
    // Create getName method
    // Create getAge method
    // Create printGreeting
}
