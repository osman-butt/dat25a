package examples.arrays;

import java.util.Scanner;

public class ArrayLoop2Example {
    public static void main(String[] args) {
        // Ask the user how many days they want to log
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hvor mange tal vil du indtaste?");
        int length = scanner.nextInt();
        // Create array
        int[] arr = new int[length];

        // Ask for each day
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Indtast et tal:");
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        // calculate average
//        int sum = 0;
////        for (int i = 0; i < arr.length; i++) {
////            sum += arr[i];
////        }
//        for (int el : arr) {
//            sum += el;
//        }

        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();

        System.out.println("SUM " + sum);


    }
}
