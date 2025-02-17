package examples.arrays;

import java.util.Arrays;

public class ArrayMethodsExample {
    public static void main(String[] args) {
        // Create an array with 5 elements
        int[] arr = new int[5];

        // Create void fillArray(int[] arr)

        // Fill the array using a method fillArray
        fillArray(arr);

        // Print using printArray
        System.out.println("Array Elements:");
        printArray(arr);

        // Find max using method findMax(int[] arr)
        int maxValueInArray = findMax(arr);
        System.out.println("Max value found in array is " + maxValueInArray);

    }

    // Fill array with random numbers (1-100)
    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100) +1;
        }
    }

    // Create method void printArray
    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    // Create int findMax(int[] arr)
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

}
