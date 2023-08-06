import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Please enter the parametr: ");
        Scanner scanner = new Scanner(System.in);
        int parametr = scanner.nextInt();
        int sum = sum(parametr)*4;
        int result  = sum(parametr)*4;
        System.out.println( sum(parametr));
        System.out.println(result );
    }

    public static int sum(int parametr) {

        int sumOfNumbers = 0;
        for (int i = 0; i <= parametr;i++){

           sumOfNumbers = sumOfNumbers + i;

        }
        return sumOfNumbers;
    }

}
// Create the usual class wrapper (Sum) and main method on your own

// Write a function called `sum()` that returns the sum of numbers from zero
// to the given parameter
//
// Example: sum(5) = 0 + 1 + 2 + 3 + 4 + 5 = 15