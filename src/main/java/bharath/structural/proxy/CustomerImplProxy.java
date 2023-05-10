package bharath.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerImplProxy implements Customer {
    private Customer customer = new CustomerImpl(2);
    @Override
    public int getId() {
        return customer.getId();
    }

    @Override
    public List<Order> getOrders() {
        List<Order> orders = new ArrayList<>();
        Order order = new Order();
        order.setId(1);
        order.setQty(1);
        order.setProductName("pen");

        Order order1 = new Order();
        order1.setProductName("paper");
        order1.setId(2);
        order1.setQty(5);

        orders.add(order);
        orders.add(order1);

        return orders;
    }
}
