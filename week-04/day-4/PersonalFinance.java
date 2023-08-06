import java.util.ArrayList;

public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList<Integer> expenses = new ArrayList<>();
        expenses.add(500);
        expenses.add(1000);
        expenses.add(1250);
        expenses.add(800);
        expenses.add(120);
        int i;
        int sum = 0;
        int max = 0;
        int min = expenses.get(0);
        float average = 0;
        int counter = 0;
        for (i = 0; i < expenses.size(); i++) {
            counter++;
            sum = sum + expenses.get(i);

            if (max < expenses.get(i)) {
                max = expenses.get(i);
            }
            if (min > expenses.get(i)) {
                min = expenses.get(i);
            }

        }
        System.out.println(counter);
        average = sum/counter;
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
        System.out.println(average);
    }
//    We are going to represent our expenses in a list containing integers.
//
//    Create a list with the following items:
//            500, 1000, 1250, 175, 800 and 120
//    Create an application which prints out the answers to the following questions:
//    How much did we spend?
//    Which was our greatest expense?
//    Which was our cheapest spending?
//    What was the average amount of our spendings? (print this as a float value)
//    The full output of your main method should be the following:
//
//            3845
//            1250
//            120
//            640.8333
}
