import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        System.out.println("Please enter the numbers: ");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int x = 0;
        int result1 = 0;
        int sum = 0;
        float average = 0;
        int[] number = new int[numbers]; // array
        for (int i = 0; i < number.length; i++) {
            x = i;
            x++;
            System.out.println("Enter number " + x + " of " + numbers);
            Scanner scanner1 = new Scanner(System.in);
            result1 = scanner1.nextInt();
            sum = sum +result1;

        }
           average = sum/numbers;
        System.out.println(numbers);
           System.out.println("Sum: "+ sum);
        System.out.println("Average: "+average);




        // Write a program that reads a number from the standard input.
        // Next, the program will prompt the user to enter as many numbers
        // as the value of the first number the user entered.
        // Once the user enters all numbers the program will print
        // their sum and average.
        //
        // Example:
        //
        // How many numbers would you like to enter: 6
        // Enter number 1 of 6: 2
        // Enter number 2 of 6: 3
        // Enter number 3 of 6: 7
        // Enter number 4 of 6: 9
        // Enter number 5 of 6: 11
        // Enter number 6 of 6: 0
        // Sum: 32, Average: 5.333333333333333
        //
    }
}

