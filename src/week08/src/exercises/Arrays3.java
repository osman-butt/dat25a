package exercises;

public class Arrays3 {
    public static void main(String[] args) {
        int[] arr = {4, 25, 12, 34, 15};
        // a
        double avg = average(arr);
        System.out.println("the average is " + avg);

        // b
        int maxValue = max(arr);
        System.out.println("The max value is " + maxValue);

        // c
        int minValue = min(arr);
        System.out.println("The min value is " + minValue);
    }

    public static double average(int[] arr) {
        int sum = 0;
        for (int el : arr) {
            sum += el;
        }
        return (double) sum / arr.length;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int el : arr) {
            max = Math.max(max, el);
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int el : arr) {
            min = Math.min(min,el);
        }
        return min;
    }
}
