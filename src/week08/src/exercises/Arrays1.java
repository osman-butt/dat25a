package exercises;

public class Arrays1 {
    public static void main(String[] args) {
        // Ex 1
        // Ex 2
        int[] nums = new int[10]; // [0, 0, 0, 0, 0, 0 ,0 ,0 ,0 ,0 ]
        System.out.println(nums[0]);
        System.out.println(nums[9]); // NEJ TAK
        System.out.println(nums[nums.length-1]);

        // Ex 3
        int[] nums3 = {27, 51, 33, -1, 101};

        // Ex 4
        int[] numbers = new int[8]; // [0, 0, 0, 0, 0, 0, 0, 0]
        numbers[1] = 4; // [0, 4, 0, 0, 0, 0, 0, 0]
        numbers[4] = 99; // [0, 4, 0, 0, 99, 0, 0, 0]
        numbers[7] = 2; // [0, 4, 0, 0, 99, 0, 0, 2]

        int x = numbers[1]; // x = 4
        numbers[x] = 44; // [0, 4, 0, 0, 44, 0, 0, 2]
        numbers[numbers[7]] = 11; // numbers[7] giver 2
        // [0, 4, 11, 0, 44, 0, 0, 2]
    }
}
