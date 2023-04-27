package bharath.behavioral.adapter.assignment;

public class PaymentApp {
    public void pay(int rupees) {
        PaymentAdapter adapter
                 = new PaymentAdapter();
        adapter.pay(rupees);
    }

    public static void main(String[] args) {
        PaymentApp app = new PaymentApp();
        app.pay(100);
    }
}
