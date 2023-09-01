public class Bunnies2 {
    public static int findSumEars(int n) {
        System.out.println(n);

        if (n <= 0) {
            return 0; //base case
        }
        if (n % 2 != 0) { // an odd number
            int count = findSumEars(n - 1);
            int result1 = 2 + count;
            return result1;
            //count = findSumEars(1)
            //   int result1 = 2 + 3;

        } else {                            // an even number
            int count = findSumEars(n - 1);// 10
            int result2 = 3 + count;
            return result2;
            // count = findSumEars(0)
            //int result2 = 3 + 0 = 3;
        }
    }

    public static void main(String[] args) {
        int sum = findSumEars(3);

        System.out.println("Total number of ears " + sum);
    }
}

// We have bunnies standing in a line numbered as 1, 2, ... The "odd" bunnies
// (1, 3, ...) have the usual number of ears = 2. However, the even bunnies
// (2, 4, ...) have 3 ears each (because they have a raised foot). Write
// a recursive method which accepts the number of bunnies as a parameter
// and returns the total number of "ears" in the bunny line. The method should be
// able to handle invalid input (e.g. negative numbers).