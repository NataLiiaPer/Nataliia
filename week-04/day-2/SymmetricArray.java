//import java.util.Scanner;
//
//public class SymmetricArray {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[][] twoDimArray = new int[n][n];
//        int x = 1;
//        for (int i = 0; i < twoDimArray.length; i++) {
//            for (int j = 0; j < twoDimArray.length; j++) {
//                twoDimArray[i][j] = x;
//                x++;
//                //  System.out.println();
//            }
//            if (twoDimArray[i][j] != twoDimArray[j][i]) {
//                System.out.println("NO");
//            } else {
//                System.out.println("Yes");
//                //    System.out.print(twoDimArray[i][j] + " ");
//            }
//        }
//    }
//}
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

