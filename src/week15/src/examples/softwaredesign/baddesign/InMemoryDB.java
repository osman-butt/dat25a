package examples.softwaredesign.baddesign;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDB {

    List<Order> orders = new ArrayList<>();

    public void saveOrder(Order order) {
        System.out.println("Saving order...");
        orders.add(order);
        System.out.println();
    }

    public List<Order> getOrders() {
        return orders;
    }
}
