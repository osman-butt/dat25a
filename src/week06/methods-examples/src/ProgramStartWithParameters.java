// Example of using void methods with parameters
public class ProgramStartWithParameters {
    public static void main(String[] args) {
        // Start the program
        startProgram();
    }

    // Create method printMessage

    public static void startProgram() {
        System.out.println("Programmet starter...");
        printWelcomeMessage();
        loadData();
        printReadyMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("Velkommen til mit program!");
    }

    public static void loadData() {
        System.out.println("Indlæser data...");
        System.out.println("Data er blevet læst!");
    }

    public static void printReadyMessage() {
        System.out.println("Programmet er klar til brug!");
    }
}