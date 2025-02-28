package inheritance.vehicle;

public class Car extends Vehicle {
    private int noOfDoors;

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public String toString() {
        return "Car{brand=" + getBrand() + ", mileage=" + getMileage() + ", noOfDoors=" + noOfDoors + "}";
    }
}
