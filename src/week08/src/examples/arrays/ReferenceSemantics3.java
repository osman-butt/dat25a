package examples.arrays;

import java.util.Arrays;

public class ReferenceSemantics3 {
    public static void main(String[] args) {
        int[][] a = new int[2][2];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i+j;
            }
        }
        int[][] b = deepCopy(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    public static int[][] deepCopy(int[][] from) {
        int[][] newArr = new int[from.length][from[0].length];
        for (int i = 0; i < from.length; i++) {
            for (int j = 0; j < from[i].length; j++) {
                newArr[i][j] = from[i][j];
            }
        }
        return newArr;
    }
}
