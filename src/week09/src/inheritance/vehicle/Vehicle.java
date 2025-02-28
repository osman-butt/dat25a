package inheritance.vehicle;

public class Vehicle {
    // Create instans vars: brand, mileage
    private String brand;
    private int mileage;

    public int getMileage() {
        return mileage;
    }

    public String getBrand() {
        return brand;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return "Vehicle{brand=" + brand + ", " + "mileage=" + mileage + "}";
    }
}
