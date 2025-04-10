package examples.interfaces.payments;

public class CashPaymentMethod implements PaymentMethod{
    @Override
    public boolean checkBalance(double amount) {
        return true;
    }

    @Override
    public void pay(double amount) {
        System.out.println("You payed " + amount + "kr cash.");
    }
}
