package examples.hotel;

public class Hotel implements Comparable<Hotel> {
    private String name;
    private String city;
    private double basePrice;

    public Hotel(String name, String city, double basePrice) {
        this.name = name;
        this.city = city;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }

    @Override
    public int compareTo(Hotel o) {
        return Double.compare(this.basePrice,o.getBasePrice());
    }
}
