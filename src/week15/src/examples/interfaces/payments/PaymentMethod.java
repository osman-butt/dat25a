package examples.interfaces.payments;

public interface PaymentMethod {
    boolean checkBalance(double amount);
    void pay(double amount);
}
