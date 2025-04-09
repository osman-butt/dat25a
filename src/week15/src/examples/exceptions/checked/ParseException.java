package examples.exceptions.checked;

public class ParseException extends Exception{
    public ParseException(String msg) {
        super(msg);
    }
}
