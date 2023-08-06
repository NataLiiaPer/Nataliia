import java.util.Scanner;

public class FizzBuzz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
           int x = 0;
         for (int i = first; i <= second; i++) {
          //  for (int i = 8; i <= 16; i++) {
            if (!(i%3==0&&i%5==0)&&!(i % 3 == 0)&&!(i % 5 == 0))
            {
                x = i;
                System.out.println(x);
            }
                if (i%3==0&&i%5==0) {
                    System.out.println("FizzBuzz");
                }
              else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
          else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }
}
//    Fizz Buzz is a classic programming problem. Here is its slightly modified version.
//
//        Write a program that takes two integers as the input: the beginning and the end of the interval (both numbers belong to the interval).
//
//        The program should output the numbers from this interval, but if the number is divisible by 3, you should output Fizz instead of it;
//        if the number is divisible by 5, output Buzz; and if it is divisible both by 3 and by 5, output FizzBuzz.
//
//        Output each number or the word on a separate line.