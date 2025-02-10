package examples.methods;

import java.util.Scanner;

public class MethodsWithObjects {
    public static void main(String[] args) {
        // Create scanner object
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Hvad er dit navn? ");
//        String name = scanner.nextLine();
        String name = getName(scanner);

//        System.out.println("Hvor gammel er du? ");
//        int age = scanner.nextInt();

        int age = getAge(scanner);

        System.out.println("Hej " + name + "! Du er " + age + " år gammel.");

        // Pass object to getName
        // Pass object to getAge
        // Pass name and age to printGreeting
        scanner.close();
    }
    // Create getName method
    public static String getName(Scanner sc) {
        System.out.println("Hvad er dit navn? ");
        return sc.nextLine();
    }
    // Create getAge method
    public static int getAge(Scanner sc) {
        System.out.println("Hvor gammel er du? ");
        return sc.nextInt();
    }

    // Create printGreeting
}
