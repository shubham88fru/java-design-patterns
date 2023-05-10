package bharath.structural.proxy;

import java.util.List;

public class CustomerImpl implements  Customer {
    private int id;
    private List<Order> orders;

    public CustomerImpl(int id) {
        this.id = id;
    }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public List<Order> getOrders() {
        return null;
    }
}
