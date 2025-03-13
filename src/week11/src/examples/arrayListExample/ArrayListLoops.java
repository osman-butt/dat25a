package examples.arrayListExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLoops {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jane");
        names.add("John");
        names.add("John");

        Iterator<String> itr = names.iterator();

        while(itr.hasNext()) {
            String str = itr.next();
            if(str.equals("John")) {
                itr.remove();
            }
        }

        itr = names.iterator();


        while(itr.hasNext()) {
            String str = itr.next();
            if(str.equals("Jane")) {
                itr.remove();
            }
        }




//        for (String s : names) {
//            if (s.equals("John")) {
//                names.remove(s);
//            }
//        }

        System.out.println(names);

    }
}
