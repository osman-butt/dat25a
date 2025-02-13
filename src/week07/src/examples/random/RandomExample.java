package examples.random;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
//        System.out.println(random.nextInt());
//        System.out.println(random.nextInt(6));
//        System.out.println(random.nextInt(10,21));
//        for (int i = 0; i < 10000; i++) {
//            System.out.println(random.nextInt(10,21));
//        }
        System.out.println(random.nextDouble());
    }
}

// Get random int
//random.nextInt();
//random.nextInt(4);
//random.nextInt(1,10);
