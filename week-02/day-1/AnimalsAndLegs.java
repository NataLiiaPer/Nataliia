import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        System.out.println("Please enter the number of chickens: ");
        System.out.println("Please enter the number of pigs: ");
        Scanner s = new Scanner(System.in);
        int chicken = s.nextInt();
        int pigs = s.nextInt();
        int chickenLegs = chicken*2;
        int pigLegs  = pigs*4;
        int sum = chickenLegs+pigLegs;
        System.out.println(sum);
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // Print how many legs all the animals have in total
        //
        // Example
        //
        // Please enter the number of chickens: 4
        // Please enter the number of pigs: 2
        // The number of legs: 16
        //
    }
}
