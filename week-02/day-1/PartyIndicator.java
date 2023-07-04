import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        System.out.println("Please enter the number of girls: ");
        System.out.println("Please enter the number of boys: ");
        Scanner s = new Scanner(System.in);
        int girls = s.nextInt();
        int boys = s.nextInt();
        int sum = girls+boys;
        if (girls == boys && sum>=20) {
            System.out.println("The party is excellent!"); // This block will run
        }

        else if(girls != boys && sum>=20 && girls>0) {
            System.out.println("Quite a cool party!"); // This block will NOT run
        }
        else if (sum<20) {
            System.out.println("Average party..."); // This block will NOT run
        }
        else if(girls == 0) {
            System.out.println("Sausage party"); // This block will NOT run
        }
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party,
        // the second represents the number of boys
        //
        // If the number of girls and boys are equal and 20 or more people are
        // coming to the party, it should print: The party is excellent!
        //
        // If there are 20 or more people coming to the party but the girl - boy
        // ratio is not 1-1, it should print: Quite a cool party!
        //
        // If there are fewer than 20 people coming,
        // it should print: Average party...
        //
        // If no girls are coming, regardless the count of the people,
        // it should print: Sausage party
        //
        // Please enter the number of girls: 15
        // Please enter the number of boys: 25
        // Quite a cool party!
    }
}
