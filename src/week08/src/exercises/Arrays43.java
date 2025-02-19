package exercises;

import java.util.Arrays;

public class Arrays43 {
    public static void main(String[] args) {
        int x = 1;
        int[] a = new int[2]; //  [ 0, 0]
        mystery(x,a);
        System.out.println(x + " " + Arrays.toString(a));
        x--; // x = x - 1; x = 0
        a[1] = a.length; // [0, 2]
        mystery(x,a); // [ 1, 2]
        System.out.println(x + " " + Arrays.toString(a)); // 0 [ 1, 2]
    }

    public static void mystery(int x, int[] list) {
        list[x]++; // [ 0, 2] -> [1, 2]

        x++; // x= 1
        System.out.println(x + " " + Arrays.toString(list)); // 1 [ 1, 2]
    }

}