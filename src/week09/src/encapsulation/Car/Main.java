package encapsulation.Car;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car();
        System.out.println(bmw);

        bmw.setBrand("BMW");
        bmw.setYear(2024);
        Person p1 = new Person();
        bmw.setOwner(p1);

        System.out.println(bmw);
        p1.setAge(20);
        p1.setFirstName("John");
        p1.setMiddleName("j");
        p1.setLastName("Doe");

        System.out.println(bmw);

        System.out.println(bmw.getBrand());



//        System.out.println(bmw);
//
//        bmw.startEngine();
//        bmw.stopEngine();
//
//
//        System.out.println(p1);
//
//        Car mercedes = new Car("Mercedes",2025, p1);
//        System.out.println(mercedes);

//        System.out.println("BMW owner " + bmw.getOwner());
    }
}
