import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {

        List<String> content = new ArrayList();
        content.add("Nataliia");
        Path filePath = Paths.get("week-07/src/Test1/my-file.txt.txt");

        try { // Required by Files.write(filePath, content)
            // Creates a new file if not exists and overwrites it's content
            // The elements of the content lists will become the lines of the file
            Files.write(filePath, content);
        } catch (IOException e) {
            System.out.println("Uh-oh, could not write the file!");
        }
    }
}

// Write a program in the `main` method that is able to manipulate a file
// by writing your name into it as a single line.
// The file should be named "my-file.txt".
// In case the program is unable to write the file,
// it should print the following error message: "Unable to write file: my-file.txt".


//import java.nio.file.Path;
//        import java.nio.file.Paths;
//        import java.nio.file.Files;
//
//public class WriteFile {
//    public static void main(String[] args) {
//        List<String> content = new ArrayList();
//        content.add("First line of my file");
//        Path filePath = Paths.get("assets/new-file.txt");
//
//        try { // Required by Files.write(filePath, content)
//            // Creates a new file if not exists and overwrites it's content
//            // The elements of the content lists will become the lines of the file
//            Files.write(filePath, content);
//        } catch (IOException e) {
//            System.out.println("Uh-oh, could not write the file!");
//        }
//    }
//}