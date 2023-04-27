package bharath.behavioral.adapter.assignment;

public class PaymentAdapter {
    public void pay(int rupees) {
        PaymentProcessor paymentProcessor
                = new PaymentProcessorImpl();

        paymentProcessor.pay(rupees/82);
    }
}
