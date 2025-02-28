package inheritance.employee;

public class Main {
    public static void main(String[] args) {
        Manager mgr = new Manager("John","Manager",40000, 4);
        Developer dev = new Developer("Osman", "Programmer", 40000,"Java");

        System.out.println(mgr.getBonus());
        System.out.println(dev.getBonus());
    }
}
