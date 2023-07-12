import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {

        System.out.println("Please provide an integer.");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if(row == 0 || row == (size -1)){
                    System.out.print("%");
                }
               else if (row == column || column ==0 || column ==(size-1)) {
                    System.out.print("%");

            } else {
                    System.out.print(" ");
                }

        }
            System.out.println("");
        }

    }
}
//        }
//
//    }}
//            // Write a program that reads a number from the standard input and
//            // then draws a square with the main diagonal of the specified size
//            //
//            // Example:
//            //
//            // Please enter the square size: 6
//            // %%%%%%
//            // %%   %
//            // % %  %
//            // %  % %
//            // %   %%
//            // %%%%%%
//            //
//        }
//      //  public static void draw(int size){
//            // Write your code to draw a square with the main diagonal here
//        }
//    }
//
