package examples.random;

import java.util.Random;

public class DieRoll {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i= 1; i <= 10; i++) {
            System.out.println(getDieRoll(random));
        }
    }

    public static int getDieRoll(Random random) {
        return random.nextInt(6)+1;
    }
}
