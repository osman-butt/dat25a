package examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) {
        File file = new File("files/text2.txt");
        PrintStream out = null;
        try {
            out = new PrintStream(file);
            out.println("Hello world");
            out.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
