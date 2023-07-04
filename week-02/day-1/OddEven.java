import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int even = 2;
        if (number%even==0){
            System.out.println("Even"); // This block will NOT run
        } else {
            System.out.println("Odd"); // This block will run
        }

        // Write a program that reads a number from the standard input,
        // then prints "Odd" нечетное if the number is odd, or "Even" четное if it is even
        //
        // Please enter a number: 7
        // Odd
    }
}
