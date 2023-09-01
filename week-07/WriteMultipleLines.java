import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
//import java.util.ArrayList;
//import java.util.List;
//

// Why I couldn't just call this method 3 time???

//public class WriteMultipleLines {
//    public static void main(String[] args) {
//        String fileName = "week-07/src/Test1/my-file.txt";
//        List<String> content = new ArrayList();
//        content.add("It is cool");
//
//      int count = 3;
     //  for (int i = 0; i < count; i++) {
//           String fileName = "week-07/src/Test1/my-file.txt";
//           List<String> content = new ArrayList();
//           content.add("It is cool");
//            writeLines(Path.of(fileName), content, count);
            //Java created it automatically
  //    }
       // writeLines(Path.of(fileName), content, count); //Java created it automatically
//    }

 //   private static void writeLines(Path filePath, List<String> word, int number) {
   //     for (int i = 0; i < number; i++){
  //      try { (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath.toFile()))); // Required by Files.write(filePath, content)
            // Creates a new file if not exists and overwrites it's content
            // The elements of the content lists will become the lines of the file
//          for (int i = 0; i < number; i++){
//              writer.write(word);
//              writer.newLine();
        //    Files.write(filePath, word);
//      }
//        } catch (IOException e) {
//            System.out.println("Uh-oh, could not write the file!");
//        }
    //    }

//    }}



// Create a function `writeLines` that takes 3 parameters: a path, a word and a number.
// The function should write multiple lines into a file.
// - The path parameter should be a string that describes the location (path & name)
//    of the file you wish to write.
// - The word parameter should also be a string that will be written to the file as individual lines.
// - The number parameter should describe how many times the function should write the word in the file.
// Example:
// If the word is "apple" and the number is 5, it should write 5 lines
// into the file and each of the should be "apple".
// When the function can't write into the file, than it shall throw a RuntimeException with the
// "Unable to write file: <path>" error message.