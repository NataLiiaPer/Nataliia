import java.util.Scanner;

public class SymmetricArray {

    public static void main(String[] args) {

        int[][] twoDimArray = {
                {0, 1, 5},
                {1, 2, 3},
                {2, 3, 4},
        };

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray.length; j++) {

                if (twoDimArray[i][j] != twoDimArray[j][i]) {
                    System.out.println(twoDimArray[i][j]);
                 System.out.println("NO");
                    return; // the end of the method
                }
            }
        }
        System.out.println("Yes"); // program will print it if array is symmetric
    }
}
//    Given the number n, not exceeding 10, and a matrix of size n × n.
//
//    Check whether this matrix is symmetric in relation to the main diagonal. Output the word “YES”,
//    if it is symmetric and the word “NO” otherwise.
//
//    Keep in mind that the main diagonal runs from the top left corner to the bottom right corner.
//    This might help
//    matrix[i][j] != matrix[j][i]
//        Sample Input 1:
//
//        3
//        0 1 2
//        1 2 3
//        2 3 4
//        Sample Output 1:
//
//        YES

