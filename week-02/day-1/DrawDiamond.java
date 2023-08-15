import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a diamond of the specified height
        //
        // Example:
        //
        // Please enter the diamond height: 4

        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // Note: the height of the diamond is taken from its base
        // (where it is the widest) to the top.
        // The total number of lines produced is 2*height-1

        // Write your code to draw the diamond here
        System.out.println("Please enter the diamond height: ");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        //   int n = 5;


        // ooooo*
        // oooo*
        // ooo*
        // oo*
        // o*
        // *

        for (int row = 0; row < height; row++) { // row = 0, height = 4
            for (int space = 0; space <= height - row; space++) {  // space = 0, space <= 5 - 0
                System.out.print("_");
            }
            for (int asterics = 0; asterics < row * 2 + 1; asterics++) {  // space = 0, space <= 5 - 0
                System.out.print("*");
            }
            System.out.println();
        }
//        for (int row = height; row >= 0; row--) {
//            for (int space = 0; space <= height - row; space++) {
//                System.out.print("_");
//            }
//            for (int asterics = 0; asterics < row * 2 + 1; asterics++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}





