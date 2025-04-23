package examples.softwaredesign.baddesign;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Order order = new Order();
//        order.addItem(new OrderItem(new Product("Pen",20), 3));
//        order.addItem(new OrderItem(new Product("Notebook",40), 2));

        OrderService orderService = new OrderService(new InMemoryDB());
//        orderService.addOrder(order);


//        double total = order.getTotalPrice();
//        System.out.println(total);
    }
}
