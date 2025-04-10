package examples.interfaces.payments;

public class CreditCardPaymentMethod implements PaymentMethod{
    @Override
    public boolean checkBalance(double amount) {
        return true;
    }

    @Override
    public void pay(double amount) {
        System.out.println("We debited your creditcard by " + amount);
    }
}
