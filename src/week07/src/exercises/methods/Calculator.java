package exercises.methods;

public class Calculator {
    public static void main(String[] args) {
        double addTest = add(12,4);
        double subtractionTest = subtraction(12,4);
        double multiplicationTest = multiply(12,4);
        double divisionTest = division(12,4);

        System.out.println(addTest);
        System.out.println(subtractionTest);
        System.out.println(multiplicationTest);
        System.out.println(divisionTest);
    }

    public static double add(double a, double b) {
        return a+b;
    }

    public static double subtraction(double a, double b) {
        return a-b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double division(double numerator, double denominator) {
        return numerator / denominator;
    }
}
