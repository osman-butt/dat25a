package encapsulation.car;

public class Car {
    private String brand;
    private int year;
    private Person owner;

//    public Car(String brand, int year)  {
//        this.brand = brand;
//        this.year = year;
//    }
//
//    public Car(String brand, int year, Person owner) {
//        this.brand = brand;
//        this.year = year;
//        this.owner = owner;
//    }

    public void startEngine() {
        System.out.println("The engine starts...");
    }

    public void stopEngine() {
        System.out.println("The engine is stopping...");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

//    public String getOwner() {
//        if (owner ==null) {
//            return "Unknown";
//        }
//        return owner.getFullName();
//    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person newPerson){
        this.owner = newPerson;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", owner=" + owner +
                '}';
    }
}
