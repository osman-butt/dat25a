package examples.interfaces.payments;

public class CheckoutService {

    public void process(String orderId, double amount, PaymentMethod method) {
        if (method.checkBalance(amount)) {
            method.pay(amount);
        } else {
            throw new RuntimeException("Not enough funds!");
        }
    }

    public void processUsingCreditCard() {

    }
    public void processUsingMobilePay() {}

}
