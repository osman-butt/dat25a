package examples.random;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        startGame(scanner, random);
    }

    public static void startGame(Scanner scanner, Random random) {
        // - randomNumber: The random number to be guessed
        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(1,101);
        // - attemptsLeft: The number of attempts allowed
        int attemptsLeft = 20;

        boolean isRunning = true;

        while (isRunning) {
            // If no attempts left, the gameover
            if (attemptsLeft==0) {
                break;
            }
            // Game loop: keep guessing until correct or attempts run out
            // Prompt the user to enter a guess
//            System.out.println("Indtast et tal ml 1-100");
//            int guess = scanner.nextInt();
//            scanner.nextLine(); // consumes \n
            int guess = getInput(scanner);

            --attemptsLeft;

            // Check if the guess is correct
            if (guess == randomNumber) {
                System.out.println("Tillykke, du gættede rigtigt!");
                isRunning = false;
            } else if (guess < randomNumber) {
                System.out.println("Dit gæt er for lavt");
            } else {
                System.out.println("Dit gæt er for højt");
            }
        }
        // Display the attemptsLeft as score at the end of the game
        System.out.println("Din score er " + attemptsLeft);
    }

    public static int getInput(Scanner scanner) {
        System.out.println("Indtast et tal ml 1-100");
        while (!scanner.hasNextInt()) {
            System.out.println("Fejl: Du har ikke indtastet et tal ml 1-100");
            scanner.nextLine();
        }
        int guess = scanner.nextInt();
        scanner.nextLine(); // consumes \n
        return guess;
    }
}