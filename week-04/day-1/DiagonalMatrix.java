//import java.util.Scanner;
//
//public class DiagonalMatrix {
//    public static void main(String[] args) {
//        // Write a program that asks for an integer `size` from the standard input,
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
//
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        int rows = size;
//        int columns = size;
//        int[][] matrix = new int[size][size];
//        System.out.println("Please enter the array (matrix) size:  ");
//        int value = 1;
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                array[i][j] = value;
//                value++;
//            }
//        }
//        for (int i = 0; i < size; i++) {
//            array[i] = scanner.nextInt();
//        }
//        int[][] matrix = create(size);
//        print(matrix);
//    }
//
//    public static int[][] create(int size) {
//        // write your code to create an nxn matrix of the given size here
//        // this matrix should already have value of 1 on the main diagonal
//
//
//        // public static void print(int[][] matrix) {
//        // write your code to print the given matrix
//        // into the (standard) output here
//    }}
//
//
