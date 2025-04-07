package examples.simple;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> ints = new ArrayList<>();
//        ints.add(2);
//        ints.add(1);
//        ints.add(9);
//        ints.add(7);
//
//        System.out.println(ints);
//
//        Collections.sort(ints);
//
//        System.out.println(ints);
//
//        Collections.sort(ints.reversed());
//        System.out.println(ints);

        ArrayList<MyInt> ints = new ArrayList<>();
        ints.add(new MyInt(2));
        ints.add(new MyInt(1));
        ints.add(new MyInt(9));
        ints.add(new MyInt(7));

        System.out.println(ints);

        Collections.sort(ints);

        System.out.println(ints);


    }
}
