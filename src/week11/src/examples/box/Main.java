package examples.box;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Box> boxes = new ArrayList<>();
        boxes.add(new Box(10));
        boxes.add(new Box(20));
        boxes.add(new Box(30));

        System.out.println(boxes);

        for (int i = 0; i < boxes.size(); i++) {
            if (boxes.get(i).getValue() == 40) {
                System.out.println("The value is 40");
            }
        }
    }
}
