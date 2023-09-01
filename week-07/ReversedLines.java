import java.io.*;
import java.util.*;

public class ReversedLines {
    public static void main(String[] args) {
        String sourcePath = "week-07/src/Test1/ReversedLinesSource.txt"; // Путь к исходному файлу
        String destinationPath = "week-07/src/Test1/outputReversed.txt"; // Путь к целевому файлу

        decryptReversed(sourcePath, destinationPath);

    }

    private static void decryptReversed(String sourceFile, String destinationFile) {

        try { // read the content of the file
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            StringBuilder outputContent = new StringBuilder();

            String line;
            while ((line = reader.readLine()) != null) {
                outputContent.append(processText(line));

            }

            reader.close();
            // Разделение содержимого на слова и обратный порядок

            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile));
            writer.write(outputContent.toString());
            //  writer.write(reversedContent);
            writer.close();

            System.out.println("The text wrote in a reverse order and saved in the file.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
    }

    public static String processText(String content) {
        // Разбиваем содержимое на слова
        String[] words = content.split("\\s+");
        StringBuilder reversedContent = new StringBuilder();

        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString(); // Переворачиваем буквы
            reversedContent.insert(0, reversedWord + " "); // Вставляем перевернутое слово в начало
        }

        // Объединяем слова обратно в текст
        String reversedText = reversedContent.toString().trim();

        // Разбиваем текст на предложения и добавляем переносы строк
        String[] sentences = reversedText.split("\\.\\s+");
        StringBuilder processedText = new StringBuilder();

        for (String sentence : sentences) {
            processedText.append(sentence).append("\n");
        }

        return processedText.toString();
    }
}


// Create a method called `decryptReversed` that takes a filename string
// as a parameter and decrypts the file's content.
// Decryption is the process reversing an encryption, i.e. the process
// which converts encrypted data into its original form.
// If the file can't be opened it should print this message: "File not found"
// The (decrypted) result should be saved in the "output.txt" file (don't change the path).
// Change the path of the reversed-lines.txt source file to the path
// where you saved it on your computer.
// You can find the source file in a link next to this exercise.

