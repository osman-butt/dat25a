package examples.motorregistry.model;

public class Motorcycle extends Vehicle {
    private int engineSize;

    public Motorcycle(String licensePlate, String brand, int year, int mileage, int engineSize) {
        super(licensePlate, brand, year, mileage);
        if (engineSize > 0) {
            this.engineSize = engineSize;
        } else {
            this.engineSize = 50; // Minimum motorstørrelse
        }
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        if (engineSize > 0) {
            this.engineSize = engineSize;
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Motorstørrelse: " + engineSize + " cc");
    }
}

