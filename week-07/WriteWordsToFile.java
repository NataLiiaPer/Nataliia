import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteWordsToFile {

    public static void main(String[] args) {



        String fileName = "week-07/src/Test1/my-file.txt"; // Укажите имя файла
        String word = "It is cool"; // Слово, которое нужно записать
        int numberOfTimes = 5; // Сколько раз записать слово
        writeLines(fileName,word,numberOfTimes);

//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
//            for (int i = 0; i < numberOfTimes; i++) {
//                writer.write(word);
//                writer.newLine(); // Добавляем новую строку между словами
//            }
//            System.out.println("Слово \"" + word + "\" было записано " + numberOfTimes + " раз в файл.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private static void writeLines(String filePath, String word, int number) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int i = 0; i < number; i++) {
                writer.write(word);
                writer.newLine(); // Добавляем новую строку между словами
            }
            System.out.println("Слово \"" + word + "\" было записано " + number + " раз в файл.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Uh-oh, could not write the file!");
        }
    }
}

