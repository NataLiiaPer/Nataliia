import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        System.out.println("Please enter the second number: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if (secondNumber < firstNumber) {
            System.out.println("The second number should be bigger");}

        if(secondNumber > firstNumber){
            for (int x = firstNumber; x < secondNumber; x++)
                System.out.println(x);}

                // Create a program that asks for two numbers. If the second number
                // is not greater than the first the program should print:
                // "The second number should be bigger"
                //
                // Otherwise it should output all integers between the first and
                // the second number (excluding the second number)
                //
                // Example:
                //
                // Please enter the first number: 3
                // Please enter the second number: 6
                // 3
                // 4
                // 5
            }
        }

