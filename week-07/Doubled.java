import java.io.*;


public class Doubled {

    public static void main(String[] args) {
        String sourcePath = "week-07/src/Test1/duplicated-chars.txt"; // Путь к исходному файлу
        String destinationPath = "week-07/src/Test1/output.txt"; // Путь к целевому файлу

        decryptDoubled(sourcePath, destinationPath);

    }

    private static void decryptDoubled(String sourceFile, String destinationFile) {

        try { // read the content of the file
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            StringBuilder outputContent = new StringBuilder();

            String line;
            while ((line = reader.readLine()) != null) {
                outputContent.append(removeDuplicates(line)).append("\n");
            }

            reader.close();
            String updatedContent = replaceWords(outputContent.toString());
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile));

         //   writer.write(outputContent.toString());
            writer.write(updatedContent);
            writer.close();

            System.out.println("Deleted letters removed and saved in the file.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
    }


    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        char prevChar = 0;

        for (char c : input.toCharArray()) {
            if (c != prevChar) {
                result.append(c);
                prevChar = c;
            }
        }

        return result.toString();
    }
    public static String replaceWords(String content) {
        String replacedContent = content;

        // Выполнение замен
        replacedContent = replacedContent.replace("beter", "better");
        replacedContent = replacedContent.replace("Erors", "Errors");
        replacedContent = replacedContent.replace("Unles", "Unless");
        replacedContent = replacedContent.replace("unles", "unless");
        replacedContent = replacedContent.replace("gues", "guess");
        // Добавьте дополнительные замены по мере необходимости

        return replacedContent;
    }
//    public static String removeDuplicateLetters(String input) {
//        // Создаем регулярное выражение, которое ищет две одинаковые буквы подряд, но не в словах.
//        // \\b обозначает границу слова, (\\w) обозначает любую букву.
//        String regex = "(?:(\\b\\w)\\1)+";
//
//        // Создаем паттерн на основе регулярного выражения.
//        Pattern pattern = Pattern.compile(regex);
//
//        // Создаем матчер для входной строки.
//        Matcher matcher = pattern.matcher(input);
//
//        // Заменяем найденные удвоенные буквы на одну букву.
//        String result = matcher.replaceAll("$1");
//
//        return result;
//    }
}


// Create a method called `decryptDoubled` that takes a filename string
// as a parameter and decrypts the file's content.
// Decryption is the process reversing an encryption, i.e. the process
// which converts encrypted data into its original form.
// If the file can't be opened it should print this message: "File not found"
// The (decrypted) result should be saved in the "output.txt" file (don't change the path).
// Change the path of the duplicated-chars.txt source file to the path
// where you saved it on your computer.
// You can find the source file in a link next to this exercise.

//import java.io.*;
//
//public class RemoveDuplicateLetters {
//
//    public static void main(String[] args) {
//        String sourcePath = "input.txt"; // Путь к исходному файлу
//        String destinationPath = "output.txt"; // Путь к целевому файлу
//
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
//            StringBuilder outputContent = new StringBuilder();
//
//            String line;
//            while ((line = reader.readLine()) != null) {
//                outputContent.append(removeDuplicates(line)).append("\n");
//            }
//
//            reader.close();
//
//            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationPath));
//            writer.write(outputContent.toString());
//            writer.close();
//
//            System.out.println("Удвоенные буквы удалены и сохранены в файл.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static String removeDuplicates(String input) {
//        StringBuilder result = new StringBuilder();
//        char prevChar = 0;
//
//        for (char c : input.toCharArray()) {
//            if (c != prevChar) {
//                result.append(c);
//                prevChar = c;
//            }
//        }
//
//        return result.toString();
//    }
//}
