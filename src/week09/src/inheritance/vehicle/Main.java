package inheritance.vehicle;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.setBrand("BMW");
        bmw.setMileage(200_000);
        bmw.setNoOfDoors(2);

        Motorcycle yamaha = new Motorcycle();

        yamaha.setBrand("Yamaha");
        yamaha.setEngineSize(600);
        yamaha.setMileage(10_000);

        System.out.println(bmw);
        System.out.println(yamaha);

        ElectricCar mercedes = new ElectricCar();
        mercedes.setRange(400);
        mercedes.setBrand("Mercedes");
        mercedes.setNoOfDoors(4);
        mercedes.setMileage(20_000);

        System.out.println(mercedes);
    }
}
