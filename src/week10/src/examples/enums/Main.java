package examples.enums;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment(PaymentStatus.COMPLETED);
//        System.out.println("Is payment complete: " + payment.isCompleted());
//        PaymentStatus paymentStatus = payment.getStatus();
//        System.out.println(paymentStatus.getMessage());


        // values() metoden
//        PaymentStatus[] statuses = PaymentStatus.values();
//
//        for (int i = 0; i < statuses.length; i++) {
//            System.out.println(statuses[i]);
//        }
//
//        for (PaymentStatus status : PaymentStatus.values()) {
//            System.out.println(status);
//        }


        // valueOf() metoden
        PaymentStatus status = PaymentStatus.valueOf("COMPLETEDASA");
        System.out.println(status.getMessage());


//        //
//        System.out.println(PaymentStatus.FAILED.getMessage());
//        System.out.println(PaymentStatus.COMPLETED.getMessage());
//        System.out.println(PaymentStatus.PENDING.getMessage());
    }
}
