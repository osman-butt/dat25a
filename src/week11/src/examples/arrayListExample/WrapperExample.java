package examples.arrayListExample;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class WrapperExample {
    public static void main(String[] args) {
        Integer b = 10;  // Autoboxing
        System.out.println(b);
        int a = b; // unboxing

        ArrayList<Integer> ints = new ArrayList<>();

        ints.add(10);
        ints.add(20);
        ints.add(30);

        System.out.println(ints);

        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(32.0);

        for (int i = 0; i < 100; i++) {
            ints.add(i);
        }

        System.out.println(ints);

        String input = "33.0";

        doubles.add(Double.parseDouble(input)); // 32.0

        System.out.println(doubles);



    }
}
