package examples.classes.point;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2,6);
        p1.x = 2;
        p1.y = 6;

        Point p2 = new Point(4,4);
//        p2.x = 4;
//        p2.y = 4;

        System.out.println("Distance to origin for p1 = " + p1.distanceToOrigin());
        System.out.println("Distance to origin for p2 = " + p2.distanceToOrigin());
        System.out.println("Distance from p1 to p2 = " + p1.distanceToPoint(p2));
    }
}
