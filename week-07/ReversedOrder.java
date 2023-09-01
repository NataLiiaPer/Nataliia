import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {
        String sourcePath = "week-07/src/Test1/ReversOrderSource.txt"; // Путь к исходному файлу
        String destinationPath = "week-07/src/Test1/my-file.txt"; // Путь к целевому файлу

        decryptReversed(sourcePath, destinationPath);


    }

    private static void decryptReversed(String sourceFile, String destinationFile) {
        try { // read the content of the file
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            List<String> lines = new ArrayList<>(); //для изменения порядка строк нужен массив
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
            // Переворачиваем порядок строк
            Collections.reverse(lines);
            // Запись перевернутых строк обратно в файл
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile));
            for (String reversedLine : lines) {
                writer.write(reversedLine + "\n");
            }

            writer.close();

            System.out.println("The strings wrote in a reverse order and saved in the file.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
    }
}

// Create a method called `decryptReversed` that takes a filename string
// as a parameter and decrypts the file's content.
// Decryption is the process reversing an encryption, i.e. the process
// which converts encrypted data into its original form.
// If the file can't be opened it should print this message: "File not found"
// The (decrypted) result should be saved in the "output.txt" file (don't change the path).
// Change the path of the reversed-order.txt source file to the path
// where you saved it on your computer.
// You can find the source file in a link next to this exercise.
//   decryptReversed("src/main/resources/static/reversed-order.txt");