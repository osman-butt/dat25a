package examples.enums;

public class Payment {
//    private int status; // 0 = PENDING, 1=Completed, 2=FAILED

    private PaymentStatus status;

    public Payment(PaymentStatus status) {
        this.status = status;
    }

    public boolean isCompleted() {
        return status == PaymentStatus.COMPLETED;
    }
}
