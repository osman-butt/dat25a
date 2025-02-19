package examples.arrays;

import java.util.Arrays;

public class ReferenceSemantics2 {
    // What are primitive data types?

    // What are non-primitive data types?

    public static void main(String[] args) {
        // value types
        int x = 10;
        System.out.println(x);
        changeValue(x);
        System.out.println(x);


        // Reference types
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        doesItMutate(arr);
        System.out.println(Arrays.toString(arr));
        doesItMutate2(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void changeValue(int x) {
        // When you call changeValue(x),
        // a copy of x is passed to the method,
        // and the method only changes the copy (not the original).
        x = 0;
    }

    public static void doesItMutate(int[] arr) {
        // You create a new array and assign it to the arr reference.
        // But this change affects only the local reference inside the method.
        // It does not change the original arr in the main method.
        arr = new int[3];
    }

    public static void doesItMutate2(int[] arr) {
        // Here, you modify the content of the array by changing
        // its first element to 0. Since the reference points
        // to the same array as in main, the change affects the original array.
        arr[0] = 0;
    }
}

/*
CONCLUSION:
-   Primitive types are passed by value, meaning changes to them in
    a method do not affect the original variable.

-   Reference types (arrays, objects) are passed by reference
    (actually the reference to the object), so changes to the object's
    state (not the reference) affect the original object.

-   If you change the reference itself (e.g., arr = new int[3];),
    it does not affect the original reference outside the method.
 */
