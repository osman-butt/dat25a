package examples.motorregistry.model;

public class Car extends Vehicle {
    private String fuelType;

    public Car(String licensePlate, String brand, int year, int mileage, String fuelType) {
        super(licensePlate, brand, year, mileage);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Brændstoftype: " + fuelType);
    }
}

