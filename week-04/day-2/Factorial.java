import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Please enter the parametr: ");
        Scanner scanner = new Scanner(System.in);
        int parametr = scanner.nextInt();
        calculateFactorial(parametr);

    }

    public static void calculateFactorial(int parametr) {
        int factorial = 1;
        for (int i = 1; i <= parametr; i++) {
            factorial = factorial * i;

        }
        System.out.println();
        System.out.println(factorial);
    }
}
//  Create the usual class wrapper (Factorial) and main method on your own

// - Create a function called `calculateFactorial()`
//   that returns the factorial of its input
//
// - Example: calculateFactorial(5) = 1 * 2 * 3 * 4 * 5 = 120