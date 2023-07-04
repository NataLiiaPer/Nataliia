import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        System.out.println("Please enter a number:");
        System.out.println("Please enter a number: ");
        System.out.println("Please enter a number:");
        System.out.println("Please enter a number: ");
        Scanner s = new Scanner(System.in);
        int one= s.nextInt();
        int two= s.nextInt();
        int three= s.nextInt();
        int four= s.nextInt();
        int five= s.nextInt();
        int sum = one+two+three+four+five;
        double average = (one + two + three + four + five) /5D;
        System.out.println("Sum: "+ sum);
        System.out.println("Average: "+ average);
         // try arrays!!!
        // double average =(double)(one + two + three + four + five) /5;
        // Write a program prompts the user for 5 integers in a row,
        // then it prints their sum and their average:
        //
        // Please enter a number: 3
        // Please enter a number: 7
        // Please enter a number: 1
        // Please enter a number: 6
        // Please enter a number: 5
        // Sum: 22, Average: 4.4
        //
    }
}
