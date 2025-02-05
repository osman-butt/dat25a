import java.util.Scanner;

public class ScannerBug {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvor gammel er du?:");
        int age = scanner.nextInt();

        scanner.nextLine(); // Consume the empty line

        System.out.println("Hvad hedder du?");
        String name = scanner.nextLine();

        System.out.println("Hej " + name + " du er " + age + " år gammel.");
        scanner.close();
    }
}
