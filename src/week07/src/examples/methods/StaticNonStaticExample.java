package examples.methods;

public class StaticNonStaticExample {
    public static void main(String[] args) {
        // Call static method
        printStaticMessage();
        // Call non-static method
//        printNonStaticMessage();
        StaticNonStaticExample myObject = new StaticNonStaticExample();
        myObject.printNonStaticMessage();
    }
    // Create static printStaticMessage method
    public static void printStaticMessage() {
        System.out.println("Static message");
    }
    // Create non-static printNonStaticMessage method
    public  void printNonStaticMessage() {
        System.out.println("Non-static message");
    }
    // Show why we can call System.out.println() without new
    // Show why we need to call new Scanner()
}