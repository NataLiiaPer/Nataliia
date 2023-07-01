public class Task6 {
    //print numbers from the array that are bigger than 5 and count how many numbers it is. Also count
    //how many numbers are in the array in total and print the result.
    public static void main (String[]args) {
        int[] numbers = {1, 6, 0, 10, 2, 5};
        int counter = 0;
        int counterOfBiggerThanFive = 0;

            for (int i = 0; i < numbers.length; i++) {
                counter++;

               if ( numbers[i]>5) {counterOfBiggerThanFive ++;
                   System.out.println(numbers[i]);

                }
            }
            System.out.println("Elements bigger than 5 "+counterOfBiggerThanFive );
            System.out.println("Elements in general "+counter);

    }}