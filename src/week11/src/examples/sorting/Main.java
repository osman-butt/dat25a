package examples.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jane");
        names.add("John");
        names.add("bob");

//        int B = 'B';
//        int J = 'J';
//
//        System.out.println(B);
//        System.out.println(J);

        System.out.println(names);
//        Collections.sort(names, Collections.reverseOrder());
        Collections.sort(names);
        System.out.println(names);

        ArrayList<Integer> ints = new ArrayList<>(List.of(1,3,5,10,2,5,7));

        System.out.println(ints);
        Collections.sort(ints);
        System.out.println(ints);
        Collections.sort(ints, Collections.reverseOrder());
        System.out.println(ints);



    }
}
