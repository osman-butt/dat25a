package encapsulation.point;

public class Point {
    // Create two instance vars: x, y
    private double x;
    private double y;
    // Create getters and setters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }


    // Create toString() method

    public double distanceToOrigin() {
        // Skal vi bruge this?
        return Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
    }

    public double distanceToPoint(Point p2) {
        return Math.sqrt(Math.pow(p2.x - this.x,2) + Math.pow(p2.y - this.y,2));
    }
}
