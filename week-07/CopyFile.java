import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class CopyFile {
    public static void main(String[] args) {
        String sourcePath = "week-07/src/Test1/my-file.txt";
        String destinationPath =  "week-07/src/Test1/NewFile1";
        copyFile(sourcePath,destinationPath);
    }

    private static void copyFile(String source,String destination) {

        try { // Создание объектов File для исходного и целевого файлов
            File sourceFile = new File(source);
            File destinationFile = new File(destination);

            // Создание FileInputStream и FileOutputStream
            FileInputStream fis = new FileInputStream(sourceFile); //fis= FileInputStream
            FileOutputStream fos = new FileOutputStream(destinationFile); //fos = FileOutputStream
            // Создание буфера для чтения и записи байтов
            byte[] buffer = new byte[1024];
            int bytesRead;
            // Чтение байтов из FileInputStream и запись их в FileOutputStream
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            // Закрытие потоков
            fis.close();
            fos.close();

            System.out.println("Файл скопирован успешно.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// Write a `copy` function that copies the contents of a file into another file.
// The function should take two filenames (strings) as parameters:
//  - path and name of the source file
//  - path and name of the target file
// It should return a boolean that shows whether the copy was successful or not.