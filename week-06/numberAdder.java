public class numberAdder {
    public static void main(String[] args) {
       int f = sumFactorial(5);

        System.out.println(f);
    }

    // 5 + 4 + 3 + 2 + 1 = 15

    public static int sumFactorial(int n) {
        if (n >= 1) {

            int sum = sumFactorial(n - 1) + n;
            //   sumFactorial(5) + 5       //0+1
            //   sumFactorial(4) + 4          //1+1
            //   sumFactorial(3) + 3         //2+1
            //   sumFactorial(2) + 2        //3+1
            //   sumFactorial(1) + 1         //4+1

            return sum;
        } else {
            return 0;
        }
    }
}

// Implement "numberAdder" which is a recursive function that takes one parameter: n (number)
// and returns the sum of integers from 1 to n.
// The function should return 0 for inputs less than 1.