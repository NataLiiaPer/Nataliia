import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadAllFiles {
    public static void main(String[] args) {
        readAllFiles("week-07/src");
    }

    public static void readAllFiles(String directoryPath) { //directoryPath vymenit na slozku week-07\src\Test2

        File directory = new File(directoryPath); // new object

        if (directory.exists() && directory.isDirectory()) {
            File[] folders = directory.listFiles(); //lambda expression
            if (folders != null) {
                for (File folder : folders) {
                    if (folder.isFile()) {                    //we want to separate folders and files
                        System.out.println("file:" + folder);
                    }
                    if (folder.isDirectory()) {                    //we want to separate folders and files
                        System.out.println("Directory:" + folder);
                    }
                }
            }
        } else {
            System.out.println("Invalid directory path");
        }
    }


    public static List<String> readFile(String file) {
        Path filePath = Paths.get(file); //convert String to text
        try {
            List<String> fileLines = Files.readAllLines(filePath);
            return fileLines;
        } catch (IOException e) {
            System.err.println("Unable to read file: " + filePath);
            return new ArrayList<>();
        }
    }
}
