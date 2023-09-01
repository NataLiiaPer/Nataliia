import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



    public class TryDuplicate {

        public static void main(String[] args) {
            String sourcePath = "week-07/src/Test1/duplicated-chars.txt"; // Путь к исходному файлу
            String destinationPath = "week-07/src/Test1/output.txt"; // Путь к целевому файлу

            try {
                BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
                StringBuilder outputContent = new StringBuilder();

                String line;
                while ((line = reader.readLine()) != null) {
                    outputContent.append(removeDuplicateLetters(line)).append("\n");
                }

                reader.close();

                BufferedWriter writer = new BufferedWriter(new FileWriter(destinationPath));
                writer.write(outputContent.toString());
                writer.close();

                System.out.println("Удвоенные буквы удалены и сохранены в файл.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static String removeDuplicateLetters(String input) {
            // Создаем регулярное выражение, которое ищет две одинаковые буквы подряд, но не в словах.
            // \\b обозначает границу слова, (\\w) обозначает любую букву.
            String regex = "(?:(\\b\\w)\\1)+";


            // Создаем паттерн на основе регулярного выражения.
            Pattern pattern = Pattern.compile(regex);

            // Создаем матчер для входной строки.
            Matcher matcher = pattern.matcher(input);

            // Заменяем найденные удвоенные буквы на одну букву.
            String result = ((Matcher) matcher).replaceAll("$1");

            return result;
        }
    }


