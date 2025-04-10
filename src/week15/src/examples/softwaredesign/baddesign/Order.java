package examples.softwaredesign.baddesign;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }
    public List<OrderItem> getItems() {
        return items;
    }

    public void saveToDatabase() {
        InMemoryDB repo = new InMemoryDB();
        repo.saveOrder(this);
    }
}
