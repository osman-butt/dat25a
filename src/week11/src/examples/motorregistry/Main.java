package examples.motorregistry;

import examples.motorregistry.model.Boat;
import examples.motorregistry.model.Car;
import examples.motorregistry.model.Motorcycle;
import examples.motorregistry.service.Registry;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Registry registry = new Registry();

        Car car1 = new Car("AB12345", "Toyota", 2018, 50000, "Benzin");
        Motorcycle moto1 = new Motorcycle("MC56789", "Yamaha", 2020, 12000, 600);
        Boat lambo = new Boat("ABCD","Lambo",2025,0,100);

        registry.addVehicle(car1);
        registry.addVehicle(moto1);
        registry.addVehicle(lambo);

        registry.listVehicles();

        registry.deleteVehicle("AB12345");
        registry.listVehicles();

     }
}