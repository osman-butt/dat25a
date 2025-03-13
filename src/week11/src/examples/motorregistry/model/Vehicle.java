package examples.motorregistry.model;

public class Vehicle {
    private String licensePlate;
    private String brand;
    private int year;
    private int mileage;

    public Vehicle(String licensePlate, String brand, int year, int mileage) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
    }

    public void drive(int km) {
        if (km > 0) {
            mileage += km;
            System.out.println(licensePlate + " har kørt " + km + " km. Ny kilometerstand: " + mileage);
        }
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        if (mileage >= 0) {
            this.mileage = mileage;
        }
    }

    public void printInfo() {
        System.out.println("Køretøj: " + brand + " (" + year + ") - Nummerplade: " + licensePlate + " - Km: " + mileage);
    }
}

