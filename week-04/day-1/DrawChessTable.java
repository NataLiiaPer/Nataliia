import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {

        System.out.println("Please enter the chess table size: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int row = 1; row < size + 1; row++) {
            if (row % 2 == 0) {
                System.out.print(" ");
            }
            for (int colomns = 0; colomns < 4; colomns++) {
                System.out.print("% ");

            }
            System.out.print("\n");

        }

    }

}

//% % % %
//        % % % %
//        % % % %
//        % % % %
//        % % % %
//
//    }
//         Write a program that reads a number from the standard input and
//         then draws a chess table of the specified size
//
//         Example:
//
//         Please enter the chess table size: 8
//         % % % %
//          % % % %
//         % % % %
//          % % % %
//         % % % %
//          % % % %
//         % % % %
//          % % % %
//    }
//            System.out.print("\n");
//    }
//            if (row%2==0){
//                for (int colomns = 0; colomns < 2; colomns++) {
//                    System.out.print("_");
//                    for (colomns = 0; colomns >=2 && colomns<5; colomns++) {
//                        System.out.print("%");
//
//            }
//                    System.out.print("\n");
//                }}}}}
//
//
//
//    public static void draw(int size){
//        // Write your code to draw the chess table here
//    }
//}

