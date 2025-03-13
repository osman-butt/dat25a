package examples.arrayListExample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCrud {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("Java");
        strings.add("Python");
        strings.add("JavaScript");

//        System.out.println(strings);

        // Get
        String java = strings.get(0);
        System.out.println(java);

        // Update
        strings.set(2,"C++");
        System.out.println(strings);

//        strings.set(3,"C#"); // indexOutOfBoundsException

        // Delete
        strings.remove("Python"); // object as parameter
        strings.remove(1); // index as parameter

        System.out.println(strings);

        // for loops
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }


        ArrayList<String> colors = new ArrayList<>(List.of("RED","GREEN","YELLOW"));
        colors.add("BLACK");
        colors.add("BLACK");
        colors.add("BLACK");

        // ["RED","GREEN","YELLOW","BLACK"]
        for (int i = 0; i < colors.size(); i++) {
            if (colors.get(i).equalsIgnoreCase("BLACK")) {
                colors.remove(i);
                i--;
            }
        }

        System.out.println(colors);


        ArrayList<String> colors3 = new ArrayList<>(List.of("YELLOW","BLACK","BLACK"));
//        colors3.add("BLACK");
//        colors3.add("BLACK");
//        colors3.add("BLACK");

        for (String a : colors3) {
            if (a.equalsIgnoreCase("BLACK")) {
                colors3.remove(a);
            }
        }


    }
}
