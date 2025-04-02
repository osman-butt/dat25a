package exercises.classes;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 2024);
        System.out.println(bmw);

        bmw.startEngine();
        bmw.stopEngine();

        Person p1 = new Person("John", null, "Doe", 24);
        System.out.println(p1);

        Car mercedes = new Car("Mercedes",2025, p1);
        System.out.println(mercedes);

        System.out.println("BMW owner " + bmw.getOwner());
    }
}
