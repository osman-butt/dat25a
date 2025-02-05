import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Opret et scanner objekt
        Scanner scanner = new Scanner(System.in);

        // Prompt brugeren for input af navn
        System.out.println("Please enter your name:");
        String inputName = scanner.nextLine();

        // Promt brugeren for input af alder
        System.out.println("Please enter your age:");
        // String inputAge = scanner.nextLine(); // Compilation ERROR! Hvordan retter vi?
        int inputAge = scanner.nextInt();

        // Tjek for alder
        System.out.println("Are you older than 18: " + (inputAge>18));

        // Udskriv det samlet tilbage til brugeren
        System.out.println("Your name is " + inputName + " and your age is " + inputAge);

        scanner.close();

        // Are you well - THIS WILL RESULT IN RUNTIME ERROR
        System.out.println("Are you okay? (true/false)");
        boolean isGood = scanner.nextBoolean();
        System.out.println("You are okay: " + isGood);
    }
}

// forsøg at udvid med
// - int inputAge = scanner.nextLine();
// - Prøv String inputAge = scanner.nextLine();
// - Ulempe: Vi kan ikke lave operationer på inputAge nu fx (inputAge>18)
// - Luk scanner og forsøg at få et input - Runtime error