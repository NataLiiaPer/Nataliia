import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        System.out.println("Please enter a distance in miles: ");
        Scanner s = new Scanner(System.in);
        double miles = s.nextDouble();
        double distance = 1.6214*miles;
        System.out.println("The distance in km:" + distance);
        // Write a program which prompts the user for a double value
        // specifying a distance in miles, converts that value
        // to kilometers and prints it
        // Example:
        //
        // Please enter a distance in miles: 1.8
        // The distance in km: 2.88
        //
    }
}

