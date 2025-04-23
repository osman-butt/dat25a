package examples.softwaredesign.baddesign;

public class OrderItem {
    private Product product;
    private int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return product.getUnitPrice() * quantity;
    }
    @Override
    public String toString() {
        return product + " x " + quantity;
    }
}

