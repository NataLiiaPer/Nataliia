import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        System.out.println("Please enter a number: ");
        Scanner s = new Scanner(System.in);
        int number1 = s.nextInt();
        int number2 = s.nextInt();
        if (number1 < number2) {
            System.out.println(number2); // This block will run
        }

        if (number1 > number2) {
            System.out.println(number1); // This block will NOT run
        }
        if (number1 == number2) {
            System.out.println(number1); // This block will NOT run
        }
        // Write a program that asks for two numbers and prints the bigger one.
        // If they are equal, it prints the second one.
        //
        // Example
        //
        // Please enter a number: 5
        // Please enter a number: 13
        // 13
    }
}

