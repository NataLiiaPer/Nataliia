import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {
        List<String> text = readFile("week-07/src/my-file.txt");
        System.out.println(text);
    }

    // Write a program that opens a file called "my-file.txt" and prints each
    // line from the file to separate lines on the console.
    // If the program is unable to read the file (for example the file does not exist),
    // it should print the following error message: "Unable to read file: my-file.txt".
    public static List<String> readFile(String file) {
        Path filePath = Paths.get(file); //convert String to text
        try {
            List<String> fileLines = Files.readAllLines(filePath);
            return fileLines;
        } catch (IOException e){
            System.err.println("Unable to read file: "+ filePath);
            return new ArrayList<>();
        }
    }
}

