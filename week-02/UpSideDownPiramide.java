import java.util.Scanner;

public class UpSideDownPiramide {

        public static void main(String[] args) {
            // Write a program that reads a number from the standard input and
            // then draws a piramide up side down of the specified height
            //
            // Example:
            //
            // Please enter the diamond height: 4
            //
            //
            //
            // *******
            //  *****
            //   ***
            //    *
            System.out.println("Please enter the piramide height: ");
            Scanner scanner  = new Scanner(System.in);
            int height = scanner.nextInt();
            //   int n = 5;

            for(int row = height;row >=0;row--){
                for(int space = 0;space <=height-row;space++){
                    System.out.print(" ");
                }
                for(int asterics = 0;asterics <row*2+1;asterics++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }}

