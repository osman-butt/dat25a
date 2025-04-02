package examples;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File folder = new File(".");

        if (folder.exists() && folder.isDirectory()) {
            listFiles(folder, "");
        } else {
            System.out.println("Folder does not exist");
        }
    }

    public static void listFiles(File folder, String indent) {
        File[] files = folder.listFiles();
        for (File file : files) {
            String prefix = indent + (file.isDirectory() ? "[DIR] " : "[FILE] ");
            System.out.println(prefix + file.getName());
            if (file.isDirectory()) {
                listFiles(file, indent + "  ");
            }
        }
    }

}