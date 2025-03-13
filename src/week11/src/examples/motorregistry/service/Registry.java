package examples.motorregistry.service;

import examples.motorregistry.model.Vehicle;

import java.util.ArrayList;

public class Registry {
//    private Vehicle[] vehicles;
    private ArrayList<Vehicle> vehicles;
//    private int count;

//    public Registry(int maxVehicles) {
////        vehicles = new Vehicle[maxVehicles];
////        count = 0;
//    }

    public Registry() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle v) {
//        if (count < vehicles.length) {
//            vehicles[count] = v;
//            count++;
//            System.out.println(v.getLicensePlate() + " er blevet tilføjet til registeret.");
//        } else {
//            System.out.println("Registeret er fuldt. Kan ikke tilføje flere køretøjer.");
//        }
        vehicles.add(v);
        System.out.println(v.getLicensePlate() + " er blevet tilføjet til registeret.");
    }

    public void deleteVehicle(String licensePlate) {
//        for (int i = 0; i < count; i++) {
//            if (vehicles[i].getLicensePlate().equalsIgnoreCase(licensePlate)) {
//                vehicles[i] = vehicles[count-1];
//                vehicles[count-1] = null;
//                count--;
//            }
//        }
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getLicensePlate().equalsIgnoreCase(licensePlate)) {
                vehicles.remove(i);
            }
        }

    }

    public void listVehicles() {
        System.out.println("\n*** Motorregister ***");
//        for (int i = 0; i < count; i++) {
//            vehicles[i].printInfo();
//            System.out.println();
//        }
        for (int i = 0; i < vehicles.size(); i++) {
            vehicles.get(i).printInfo();
            System.out.println();
        }
    }
}

