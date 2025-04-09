package examples.exceptions.unchecked;

import java.util.Scanner;

public class UncheckedDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indtast et tal");
        int num = scanner.nextInt();
        scanner.nextLine(); // Consume \n

        if (num < 0) {
            System.out.println("Tallet kan ikke være negativt");
        } else {
            System.out.println(sqrt(num));
        }

//        try {
//            double sqrt = sqrt(num);
//            System.out.println(sqrt);
//        } catch (NegativeNumberException e) {
//            throw new RuntimeException();
//        } finally {
//            System.out.println("Denne kode kører altid");
//        }
    }

    public static double sqrt(int num) {
        if (num < 0) {
            throw new NegativeNumberException("Kan ikke tage kvadratroden af et negativt tal");
        }
        return Math.sqrt(num);
    }
}
