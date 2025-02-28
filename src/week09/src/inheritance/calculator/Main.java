package inheritance.calculator;

public class Main {
    public static void main(String[] args) {
        Calc cal = new Calc();
        System.out.println(cal.add(2,4));

        AdvCalc advCalc = new AdvCalc();
        System.out.println(advCalc.division(1,3));
        System.out.println(advCalc.product(2,3));
        System.out.println(advCalc.subtact(2,3));
        System.out.println(advCalc.add(2,3));

    }
}
