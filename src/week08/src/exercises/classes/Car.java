package exercises.classes;

public class Car {
    String brand;
    int year;

    Person owner;

    public Car(String brand, int year)  {
        this.brand = brand;
        this.year = year;
    }

    public Car(String brand, int year, Person owner) {
        this.brand = brand;
        this.year = year;
        this.owner = owner;
    }

    public void startEngine() {
        System.out.println("The engine starts...");
    }

    public void stopEngine() {
        System.out.println("The engine is stopping...");
    }

    public String getOwner() {
        if (owner ==null) {
            return "Unknown";
        }
        return owner.getFullName();
    }

    public String toString() {
        return "CAR{brand="+brand+ ", " + year + "}";
    }
}
