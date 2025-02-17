package exercises;

public class Arrays2 {
    public static void main(String[] args) {
        // Ex1
        int[] list = {2, 18, 6, -4, 5, 1};
        for (int i = 0; i < list.length; i++) {
            list[i] = list[i] + (list[i] / list[0]);
        }

        // Ex2
        // a
        double[] arr = {4.5, 25.3, 12.1, 34.0, 15.5};
        for (int i = 0; i < arr.length; i++) {
//            System.out.print(Math.pow(arr[i],2) + " ");
            arr[i] = Math.pow(arr[i],2);
            System.out.print(arr[i]);
        }
        System.out.println();

        // b
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.sqrt(arr[i]);
            System.out.print(arr[i] + " ");
//            System.out.print(Math.sqrt(arr[i]) + " ");
        }
        System.out.println();

        // c
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 34.0) {
                System.out.println("Value found at index = " + i);
            }
        }

        // d
        double max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Max er " + max + " fundet på index " + maxIndex);

        // e
        double min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }

        System.out.println("Min er " + min + " fundet på index " + minIndex);
    }
}
