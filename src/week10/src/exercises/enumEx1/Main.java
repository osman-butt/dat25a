package exercises.enumEx1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vælg et tal ml 1 og 3:");
        int input = scanner.nextInt();

        switch (input) {
            case 1 -> System.out.println("Du har valgt farven " + Colors.RØD);
            case 2 -> System.out.println("Du har valgt farven " + Colors.GRØN);
            case 3 -> System.out.println("Du har valgt farven " + Colors.BLÅ);
            default -> System.out.println("Ugyldigt valg");
            }
        }


    }
}
