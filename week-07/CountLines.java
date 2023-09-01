import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class CountLines {

    public static void main(String[] args) {
      //  countLine(fileName);
        String fileName = "week-07/src/my-file.txt"; // Замените на имя вашего файла
        countLine(fileName);
//        try (LineNumberReader reader = new LineNumberReader(new FileReader(fileName))) {
//            while (reader.readLine() != null) {
//                // Чтение каждой строки, LineNumberReader автоматически подсчитывает номер строки
//            }
//
//            int lineCount = reader.getLineNumber(); // Получение общего количества строк
//
//            System.out.println("Количество строк в файле: " + lineCount);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private static void countLine(String fileName) {
        try (LineNumberReader reader = new LineNumberReader(new FileReader(fileName))) {
            while (reader.readLine() != null) {
                // Чтение каждой строки, LineNumberReader автоматически подсчитывает номер строки
            }

            int lineCount = reader.getLineNumber(); // Получение общего количества строк

            System.out.println("Количество строк в файле: " + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



// Write a function called countLines() that takes a filename as string as a parameter
// and returns the number of lines the file contains.
// It should return zero if it can't open the file
// and should not raise any error.