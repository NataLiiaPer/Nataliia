import java.util.Scanner;

public class DrawSquare2 {
    public static void main(String[] args){

        System.out.println("Please provide an integer.");
        Scanner scanner  = new Scanner(System.in);
        int input = scanner.nextInt();

        String outer = "";
        String inner = "";
        for (int i = 0; i < input; i++) {
            outer += "%";
        }
        for (int i = 0; i < input; i++) {
            if(i == 0 || i == input -1){
                inner += "%";
            }
            else {
                inner += " ";
            }
        }
        for(int i =0; i < input; i++){
            if(i == 0 || i == input -1){
                System.out.println(outer);
            }
            else {
                System.out.println(inner);
            }
        }
        //System.out.println(input);
    }

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