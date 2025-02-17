package examples.arrays;

import java.util.Arrays;

public class ArrayBasicsExample {
    public static void main(String[] args) {
        // instantiate array - unknown size and values
        int[] numbers;
        numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[9] = 3;
        numbers[8] = 3;

        // instantiate array - known size unknown values
        int[] numbers2 = new int[3];
        numbers2[numbers2.length-1] = 10;

        // Instantiate array - known size and known values
        int[] numbers3 = {1,3,4};

        int myNum = numbers3[2];

//        System.out.println(numbers3[2]);

        // Printing arrays
        System.out.println(numbers3);
        System.out.println(Arrays.toString(numbers3));

        // Default values Primitives
        char[] charArr = new char[3];
        boolean[] boolArr = new boolean[3];
        System.out.println(Arrays.toString(boolArr));
        String[] strArr = new String[3];
        System.out.println(Arrays.toString(strArr));

        // Default values String

        // ArrayIndexOutOfBounds
//        System.out.println(numbers3[3]);;

        // Setting the last value
        numbers3[numbers3.length-1] = 3;


    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}