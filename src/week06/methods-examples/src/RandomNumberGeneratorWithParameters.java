// Example: Methods with return value and no parameter
public class RandomNumberGeneratorWithParameters {

    // Make the random number generator more flexible
    public static int generateRandomNumber(int start, int end) {
        // Random number between 10 and 20 inclusive (why we add 1)
        double randomDouble = Math.random() * (end - start + 1) + start;
        return (int) randomDouble;
    }

    public static void main(String[] args) {
        int randomNumber = generateRandomNumber(10,20);
        System.out.println("Random number is " + randomNumber);

        if ((randomNumber % 2) == 0) {
            System.out.println("The random number is even");
        } else {
            System.out.println("The random number is odd");
        }
    }
}