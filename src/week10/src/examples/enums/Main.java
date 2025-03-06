package examples.enums;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment(PaymentStatus.COMPLETED);
        System.out.println(payment.isCompleted());
    }
}
