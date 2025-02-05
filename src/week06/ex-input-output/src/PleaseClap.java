import java.util.Scanner;

public class PleaseClap {
    public static void main(String[] args) {
        String text = "I am happy today";
        System.out.println(text.replace(" ","👏").toUpperCase());

        // User input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indtast en sætning:");
        String inputText = scanner.nextLine();

        System.out.println(inputText.replace(" ", "👏").toUpperCase());

        // Forskel mellem .replaceAll and .replace
        // - replace erstatter alle tegn
        // - replaceAll tillader brug af regex
    }
}