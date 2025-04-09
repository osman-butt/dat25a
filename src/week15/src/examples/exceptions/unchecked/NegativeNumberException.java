package examples.exceptions.unchecked;

public class NegativeNumberException extends ArithmeticException {
    public NegativeNumberException(String msg) {
        super(msg);
    }
}
