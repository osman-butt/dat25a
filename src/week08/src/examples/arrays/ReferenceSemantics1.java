package examples.arrays;

import java.util.Arrays;

public class ReferenceSemantics1 {
    public static void main(String[] args) {
        int[] arr = {3,1,4,1,5};
        int[] arr2 = arr;
        System.out.println("arr  = " + Arrays.toString(arr));
        System.out.println("arr2 = " + Arrays.toString(arr));
        System.out.println("Change value on index 0 in arr2");
        arr2[0] = 0;
        System.out.println("arr  = " + Arrays.toString(arr));
        System.out.println("arr2 = " + Arrays.toString(arr));
    }
}
