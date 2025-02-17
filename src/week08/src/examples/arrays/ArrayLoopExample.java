package examples.arrays;

import javax.lang.model.type.ArrayType;
import java.util.Arrays;

public class ArrayLoopExample {
    public static void main(String[] args) {
        // Create an empty array
        int[] arr = new int[10];

        // Set values inside loop
        System.out.println("---- For loop (Set values) ----");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        // Print using for loop
        System.out.println("---- For loop (print values) ----");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Print using for-each loop
        System.out.println("---- For Each loop ----");
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();

        // Can you set elements using for-each
        System.out.println("---- For each set local var ----");
        for (int el : arr) {
            el = 0;
        }
//        System.out.println(Arrays.toString(arr));

        // Print arr again
        System.out.println("---- For each print ----");
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
