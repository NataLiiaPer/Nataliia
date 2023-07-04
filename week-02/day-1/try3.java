import java.util.Scanner;

public class try3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        System.out.println("Please enter the second number: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        if (secondNumber > firstNumber) { //6 3
            for (int x = firstNumber; x < secondNumber; x++)
                System.out.println(x);
        }
    }}
