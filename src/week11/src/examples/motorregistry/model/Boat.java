package examples.motorregistry.model;

public class Boat extends Vehicle {
    private int length;

    public Boat(String licensePlate, String brand, int year, int mileage, int length) {
        super(licensePlate,brand, year, mileage);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void printInfo() {
        System.out.println("Køretøj: Båd,  " + super.getBrand() + " (" + getYear() + ") - Nummerplade: " + getLicensePlate() + " - Km: " + getMileage() + ", boat length = "+length);
    }


    @Override
    public String toString() {
        return "Boat{" +
                "length=" + length +
                '}';
    }
}
