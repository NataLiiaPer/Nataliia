import java.util.Scanner;

public class TrianglUpSideDown {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a triangle of the specified height
        //
        // Example:
        //
        // Please enter the triangle height: 4
        // ****
        // ***
        // **
        // *




        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the triangle height: ");
        int height = scanner.nextInt();
        for (int row = height; row >= 0; row--) {
            for (int asterics = 1; asterics <= row; asterics++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }}

