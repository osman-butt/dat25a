package examples.arrays;

import java.util.Arrays;

public class ArraysClassExample {
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 8, 3, 2, 7, 4, 6};

        // a
        String strArr = Arrays.toString(arr);
        System.out.println(strArr);

        // b
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));

        // c
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.equals(arr,arr2));
    }
}
