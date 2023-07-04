import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a triangle of the specified height
        //
        // Example:
        //
        // Please enter the triangle height: 4
        // *
        // **
        // ***
        // ****




            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the triangle height: ");
           int height = scanner.nextInt();
            for (int row = 1; row <= height; row++) {
                for (int j = 1; j <= row; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }}

