package examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerReadFileDemo2 {
    public static void main(String[] args) {
        File file = new File("src/week14/src/examples.FileDemo.java");

        try {
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error reading file");
        }
    }
}
