package exercises.methods;

import java.util.Scanner;

public class FutureAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String name = getName(scanner);
//        int birthYear = getBirthYear(scanner);

//        int ageInFuture = calculateAgeInFuture(birthYear, 2050);
//        printMessage(name, ageInFuture);

        scanner.close();
    }

    // TODO:
    // Lav en metode getName der:
    // - Modtager et scanner objekt som parameter
    // - Spørg brugeren om et navn
    // - Returner navnet som en String

    // TODO:
    // Lav én metode getBirthYear der:
    // - Modtager et scanner objekt som parameter
    // - Spørg brugeren om deres fødselsår
    // - Returner fødselsåret som et int

    public static int calculateAgeInFuture(int birthYear, int futureYear) {
        return futureYear - birthYear;
    }

    public static void printMessage(String name, int ageInFuture) {
        System.out.println(name + ", du vil være " + ageInFuture + " år gammel i 2050.");
    }
}
