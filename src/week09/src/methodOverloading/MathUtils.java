package methodOverloading;

public class MathUtils {
    public static double add(double a, double b) {
        return a+b;
    }

    public static double add(float a, float b) {
        return a+b;
    }
    public static int add(float a, float b, float c) {
        return (int)(a+b+c);
    }

    public static double add(int a, int b) {
        return a+b;
    }

    public static String add(String a, String b) {
        return a+" "+b;
    }
}
