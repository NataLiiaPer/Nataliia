import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String userName;
        System.out.println("Please enter your name");
        userName = s.nextLine();
        System.out.println("Hello, "+ userName);
        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User
        //
        // Example:
        //
        // Please enter your name: John Doe
        // Hello, John Doe!
        //

    }
}