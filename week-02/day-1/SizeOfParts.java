import java.util.Scanner;

public class SizeOfParts {
    public static void main(String[] args) {
        System.out.println("Please enter the numbers: ");
        Scanner scanner = new Scanner(System.in);
        int standard = 0;
        int x = 0;
        int result1 = 0;
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            x = i;
            x++;
            System.out.println("Enter number " + x + " of " + n);
            Scanner scanner1 = new Scanner(System.in);
            result1 = scanner1.nextInt();
            if (result1 > standard) {
                larger++;

                System.out.println(1);

            } else if (result1 < standard) {
                smaller++;
                System.out.println(-1);
            } else {
                perfect++;
                System.out.println(0);
            }
        }

        System.out.println(larger);
        System.out.println(smaller);
        System.out.println(perfect);

    }
}
// A detector compares the size of parts produced by a machine with the reference standard.
//    If the size of the part is larger, it can be sent to be fixed, and the detector prints the number 1.
//    If the size of the part is smaller, it is removed as a reject, and the detector prints the number -1.
//    If the part is perfect, it is sent to the box with products, that are ready to ship,
//    and the detector prints 0.
//    Write a program, which takes the number of parts n as input, and
//    then the sequence of n detector prints. The program should count the total number
//    of parts ready to be shipped, the number of parts to be fixed, and the number of rejects.
//    After that, the program should output these numbers in that order in a single line,
//    separated by blank spaces


