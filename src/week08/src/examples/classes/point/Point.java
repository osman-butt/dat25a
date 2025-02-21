package examples.classes.point;

public class Point {
    double x;
    double y;

    public Point() {}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceToOrigin() {
        // Skal vi bruge this?
        return Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
    }

    public double distanceToPoint(Point p2) {
        return Math.sqrt(Math.pow(p2.x - this.x,2) + Math.pow(p2.y - this.y,2));
    }
}
