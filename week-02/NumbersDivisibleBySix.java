import java.util.Scanner;

public class NumbersDivisibleBySix {
    public static void main(String[] args) {
        System.out.println("Please enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int numberInTheSequence = scanner.nextInt();
        int x = 0;
        int sum = 0;
        for (int i = 0; i < numberInTheSequence; i++) {
            //  Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter the elements: ");
            int elements = scanner.nextInt();
            x++;
            x = elements;
            System.out.println(elements);
            if (elements % 6 == 0) {
                sum = sum + elements;
            }
        }
        System.out.println(sum);
    }
}

//    Find the sum of numbers divisible by 6 in the given sequence of natural numbers.
//
//        The first line of the input is the number in the sequence; the next lines are the elements themselves.
//
//        It is guaranteed that there is always a number divisible by 6 in the sequence.
//        TIp : the first number in input is the length of remaining input.
//        ( The input is the number of elements in the sequence, and then the elements themselves.)