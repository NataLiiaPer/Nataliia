
    import java.io.*;


    public class TryDuplicate1 {
        public static void main(String[] args) {
            String sourcePath = "week-07/src/Test1/duplicated-chars.txt"; // Путь к исходному файлу
            String destinationPath = "week-07/src/Test1/output.txt"; // Путь к целевому файлу

            try {
                BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
                StringBuilder outputContent = new StringBuilder();

                String line;
                while ((line = reader.readLine()) != null) {
                    outputContent.append(removeUngrammaticalDuplicates(line)).append("\n");
                }

                reader.close();

                BufferedWriter writer = new BufferedWriter(new FileWriter(destinationPath));
                writer.write(outputContent.toString());
                writer.close();

                System.out.println("Удвоенные буквы в неграмматических местах удалены и сохранены в файл.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static String removeUngrammaticalDuplicates(String input) {
            StringBuilder result = new StringBuilder();
            char prevChar = 0;
            boolean lastCharIsLetter = false;

            for (char c : input.toCharArray()) {
                if (Character.isLetter(c)) {
                    if (c != prevChar || !lastCharIsLetter) {
                        result.append(c);
                    }
                    lastCharIsLetter = true;
                } else {
                    result.append(c);
                    lastCharIsLetter = false;
                }
                prevChar = c;
            }

            return result.toString();
        }
    }

