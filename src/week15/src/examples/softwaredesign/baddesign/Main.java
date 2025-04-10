package examples.softwaredesign.baddesign;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem(new OrderItem(new Product("Pen",20), 3));
        order.addItem(new OrderItem(new Product("Notebook",40), 2));

        order.saveToDatabase();

        double total = 0;
        for (OrderItem item : order.getItems()) {
            total += item.getQuantity() * item.getProduct().getUnitPrice();
        }
        System.out.println(total);
    }
}
