import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();
       divide10By(divisor);

   //     System.out.println(result);
        // Create a `divide10By` function that divides number 10 (integer)
        // by an integer number that's passed as a parameter and prints the result.
        // The result of the division should be an integer as well (not a floating point number).
        // It should print "fail" if the parameter is 0

        // Examples:
//        divide10By(2); // should print 5
//        divide10By(5); // should print 2
//        divide10By(4); // should print 2
//        divide10By(3); // should print 3
//        divide10By(0); // should print fail
    }
    public static void divide10By(int number){
      //  int result = 10/number;
        try { // Prevents the program breaking when attempting dividing by zero
            int result = 10/number;// If the input value for divisor was 0 it stops the try block
           System.out.println(result); // The program doesn't reach this line if the input was 0
       } catch (ArithmeticException e) {
          System.out.println("Can't divide by zero!"); // This line only runs if the input was 0
       }
  //      System.out.println(result);
    }
}

//Exceptions
//        import java.util.Scanner;
//
//public class UnhandledException {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int divisor = scanner.nextInt();
//
//        int result = 12 / divisor; // If the input value for divisor was 0 the program breaks
//        System.out.println(result); // The program doesn't reach this line if the input was 0
//    }
//}


//The result if the input value was zero:
//
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at UnhandledException.main(UnhandledException.java:8)
//        Handle the exception:
//
//        import java.util.Scanner;
//
//public class ErrorHandling {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int divisor = scanner.nextInt();
//
//        try { // Prevents the program breaking when attempting dividing by zero
//            int result = 12 / divisor; // If the input value for divisor was 0 it stops the try block
//            System.out.println(result); // The program doesn't reach this line if the input was 0
//        } catch (ArithmeticException e) {
//            System.out.println("Can't divide by zero!"); // This line only runs if the input was 0
//        }
//    }
//}