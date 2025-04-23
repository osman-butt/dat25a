package examples.softwaredesign.baddesign;

public class OrderService {
    private final Repository repository;

    public OrderService(Repository repository) {
        this.repository = repository;
    }

    public Order createOrder() {
        return new Order();
    }

    public void addToOrder(Order order,OrderItem item) {
//        order.
    }

    public void addOrder(Order order) {
        repository.save(order);
    }
}
