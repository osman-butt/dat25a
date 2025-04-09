package examples.exceptions.checked;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionDemo {

    public static void readFile(String fileName) throws FileNotFoundException, ParseException {
        Scanner reader = new Scanner(new File(fileName));

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            new Person(line);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast et fil navn");
        String fileName = scanner.nextLine();

//        readFile(fileName);

        try {
            readFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Kunnne ikke finde filen");
        } catch (ParseException e) {
            System.out.println("Kunne ikke parse filen");
        }


    }
}
