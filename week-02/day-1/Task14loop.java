import java.util.Scanner;

public class Task14loop {
    public static void main(String[] args) {
        System.out.println("Please enter the numbers: ");
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int counter = 0;
        for (int i = a; i < b; i++) {
            if (i % n == 0) {
                counter++;

            }

        }
        System.out.println(counter);
    }
}

