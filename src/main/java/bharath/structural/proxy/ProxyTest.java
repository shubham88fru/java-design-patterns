package bharath.structural.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Customer customer = new CustomerImplProxy();
        System.out.println(customer.getId());
        System.out.println(customer.getOrders());

    }
}
