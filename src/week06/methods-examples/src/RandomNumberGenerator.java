// Example: Methods with return value and no parameter
public class RandomNumberGenerator {
    // Create a method that returns a random number between 0 and 9
    // Use the built in currentmillis
    public static int randomNumberGeneratorFirstAttempt() {
        long currentTimeInMillis = System.currentTimeMillis(); // 1738848107087
        return (int) (currentTimeInMillis % 10); // currentTimeInMillis / 10 = 173884810708.7
    }

    public static void main(String[] args) {
        // Use the randomNumber method
        System.out.println(randomNumberGeneratorFirstAttempt());
        // Print to randomNumber to console
        // Are there other built-in ways to do this?
        // EXTRA: Check if it is even or odd
    }
}



