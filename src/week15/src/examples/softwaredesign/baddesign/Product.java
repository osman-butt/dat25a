package examples.softwaredesign.baddesign;

public class Product {
    private String productName;
    private double unitPrice;

    public Product(String productName, double unitPrice) {
        this.productName = productName;
        this.unitPrice = unitPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "product = " + productName + "unitPrice = " + unitPrice;
    }
}
