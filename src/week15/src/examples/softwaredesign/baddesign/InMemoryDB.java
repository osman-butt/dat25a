package examples.softwaredesign.baddesign;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDB implements Repository {

    List<Order> orders = new ArrayList<>();

    @Override
    public void save(Order order) {
        System.out.println("Saving order...");
        orders.add(order);
        System.out.println();
    }

    public List<Order> getOrders() {
        return orders;
    }

}
