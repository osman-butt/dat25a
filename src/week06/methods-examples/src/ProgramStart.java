// Example of using void methods with no parameters
public class ProgramStart {

    public static void main(String[] args) {
        // Start the program
        startProgram();
    }
    // Create method startProgram()
    public static void startProgram() {
        System.out.println("Programmet starter...");
        printWelcomeMessage();
        loadData();
        printReadyMessage();
    }
    // Create method printWelcomeMessage()
    public static void printWelcomeMessage() {
        System.out.println("Velkommen til mit program!");
    }
    // Create method loadData()
    public static void loadData() {
        System.out.println("Indlæser data...");
        System.out.println("Data er blevet læst!");
    }
    // Create method printReadyMessage()
    public static void printReadyMessage() {
        System.out.println("Programmet er klar til brug!");
    }
}