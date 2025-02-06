// Example of using void methods with parameters
public class ProgramStartWithParameters {
    public static void main(String[] args) {
        // Start the program
        startProgram();
    }

    // Create method printMessage
    public static void printMessage(String message) {
        System.out.println(message);

    }

    public static void startProgram() {
        printMessage("Programmet starter...");
        printWelcomeMessage();
        loadData();
        printReadyMessage();
    }

    public static void printWelcomeMessage() {
        printMessage("Velkommen til mit program!");
    }

    public static void loadData() {
        printMessage("Indlæser data...");
        printMessage("Data er blevet læst!");
    }

    public static void printReadyMessage() {
        printMessage("Programmet er klar til brug!");
    }
}