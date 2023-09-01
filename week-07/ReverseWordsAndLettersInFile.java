import java.io.*;
import java.util.*;
// черновой вариант
public class ReverseWordsAndLettersInFile {

    public static void main(String[] args) {
        String filePath = "week-07/src/Test1/ReversedLinesSource.txt"; // Путь к файлу

        try {
            // Чтение содержимого файла
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            StringBuilder fileContent = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                fileContent.append(processText(line)).append("\n");
            }
            reader.close();

            // Разбиваем содержимое на слова, переворачиваем буквы в словах,
            // переворачиваем порядок слов и объединяем обратно
       //     String reversedContent = reverseWordsAndLetters(fileContent.toString());

            // Запись обратного содержимого обратно в файл
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(fileContent.toString());
            writer.close();

            System.out.println("Содержимое файла было перевернуто и сохранено.");
        } catch (IOException e) {
            e.printStackTrace();
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
            processedText.append(sentence).append(".\n");
        }

        return processedText.toString();
    }
    }




