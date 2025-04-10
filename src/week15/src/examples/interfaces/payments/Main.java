package examples.interfaces.payments;

public class Main {
    public static void main(String[] args) {
        CheckoutService checkoutService = new CheckoutService();
        PaymentMethod creditCard = new CreditCardPaymentMethod();
        PaymentMethod mobilePay = new MobilPayPaymentMethod();
        PaymentMethod cashPayment = new CashPaymentMethod();

        checkoutService.process("ID001",200,cashPayment);
    }
}
