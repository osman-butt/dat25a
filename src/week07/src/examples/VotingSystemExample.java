package examples;

import java.util.Scanner;

public class VotingSystemExample {
    // Aldersindgang
    // Valider alder
    // Vælg kandidat
    // Afslutning
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast din alder:");
//        int age = scanner.nextInt();
        int age = getInput(scanner, "Du skal indtaste en numerisk værdi");
        boolean canVote = isEligibleForVoting(age);

        if (canVote) {
            showMenu(scanner);
        }
    }

    public static int getInput(Scanner scanner, String errorMessage) {
        while (!scanner.hasNextInt()) {
            System.out.println(errorMessage);
            scanner.nextLine();
        }

        int input = scanner.nextInt();
        scanner.nextLine();
        return input;
    }

    public static void showMenu(Scanner scanner) {
        while (true) {
            System.out.println("Vælg en kandidat");
            System.out.println("1: John Doe");
            System.out.println("2: Jane Doe");
//            int choice = scanner.nextInt();
            int choice = getInput(scanner, "Indtast et tal mellem 1-2");
            switch (choice) {
                case 1 -> {
                    System.out.println("Du har stemt på John Doe");
                    return;
                }
                case 2 -> {
                    System.out.println("Du har stemt på Jane Doe");
                    return;
                }
                default -> System.out.println("Ugyldigt valg!");
            }
        }

    }

    public static boolean isEligibleForVoting(int age) {
        if (age < 18) {
            System.out.println("Du er ikke gammel nok til at stemme!");
            return false;
        }
        return true;
    }

}
