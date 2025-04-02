package examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScannerReadFileDemo {
    public static void main(String[] args) {
        File file = new File("test.txt");

        if (file.exists()) {
            try {
                readFile(file);
            } catch (FileNotFoundException e) {
                System.out.println("FILE NOT FOUND");
            }
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("File created");
                    readFile(file);
                } else {
                    System.out.println("Unable to create file");
                }
            } catch (IOException e) {
                System.out.println("Error while creating file");
            }
        }

    }

    public static void readFile(File file) throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }
        reader.close();
    }
}
