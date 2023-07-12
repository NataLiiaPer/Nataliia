import java.util.Scanner;

public class DrawPyramid {
        public static void main(String[] args) {
            // Write a program that reads a number from the standard input and
            // then draws a pyramid of the specified height
            //
            // Example:
            //
            // Please enter the pyramid height: 4
            //    *
            //   ***
            //  *****
            // *******



            // Write your code to draw the pyramid here
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the pyramid height: ");
            int height = scanner.nextInt();

            for (int row = 0; row < height; row++){
                for(int x = 0;x <height-1;x++){
                    System.out.print(" ");
            {
                for (int j = 1; j <= row*2+1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }}}}

