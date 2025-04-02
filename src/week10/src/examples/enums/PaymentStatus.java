package examples.enums;

public enum PaymentStatus {
    PENDING("Waiting for confirmation"),
    COMPLETED("Payment completed"),
    FAILED("Payment failed");

    private String message;

    PaymentStatus(String message) {
//        System.out.println("INSIDE CONSTRUCTOR");
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
