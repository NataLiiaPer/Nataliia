package day;

import java.util.Scanner;

public class DrawSq {
    public static void main(String[] args){

        System.out.println("Please provide an integer.");
        Scanner scanner  = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = 0; i < input; i++){ // i = row = 0
            if (i == 0 || i == input -1){
                for(int j = 0; j < input; j++){
                    System.out.print("%");
                    if (j == input - 1){
                        System.out.print("\n");
                    }
                }
            }
            else {
                for(int j = 0; j < input; j++){
                    if (j == 0){
                        System.out.print("%");
                    } else if (j == input -1) {
                        System.out.print("%\n");
                    }
                    else{
                        System.out.print(" ");
                    }

                }
            }
        }

    }
    //System.out.println(input);
    // Write a program that reads a number from the standard input and
    // then draws a square of the specified size
    //
    // Example:
    //
    // Please enter the square size: 6
    // %%%%%%
    // %    %
    // %    %
    // %    %
    // %    %
    // %%%%%%
    //
}

