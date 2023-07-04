import java.util.Scanner;
public class Try1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        System.out.print("a = ");
        int a = scanner.nextInt();
        int output1 = 0;
        if (a % 2 == 0) {
            // if the value of 'a' is even increment output1 by one
            output1++;
            System.out.println("Output #1: " + output1);
        }
    }
}

