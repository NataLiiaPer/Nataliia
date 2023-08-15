

// Example:  Implementation of 2D array with User input

import java.util.Scanner;

public class TryMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the array (matrix) size: ");
        int size = scan.nextInt();

        int[][] multidimensionalArray = new int[size][size];

        // Now you can use the array like a regular
        // 2-dimensional array

        for (int row = 0; row < multidimensionalArray.length; row++) { // i = row i=4
            for (int column = 0; column < multidimensionalArray[row].length; column++) { // j = columns
                 if (column == row){
                     multidimensionalArray[row][column] = 1;
                 }
                System.out.print(multidimensionalArray[row][column]);
            }
            System.out.println();
        }


    }
}


// Write a program that asks for an integer `size` from the standard input,
//        // then it creates a two-dimensional array (of integers) of the specified
//        // size (nxn) with the value of 1 on the main diagonal and the value of 0
//        // everywhere else. Print the 2d array into the output
//        //
//        // Example:
//        //
//        // Please enter the array (matrix) size: 4
//        // 1 0 0 0
//        // 0 1 0 0
//        // 0 0 1 0
//        // 0 0 0 1