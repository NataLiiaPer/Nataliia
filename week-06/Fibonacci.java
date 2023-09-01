public class Fibonacci { //Мемоизация (memoization)
    private static long[] fibonacciCache;

    public static void main(String[] args) {

        int n = 6;
        fibonacciCache = new long[n + 1]; //длина массива (чтобы вычислить 3ий номер длина масива д.б. 4)
        for (int i = 0; i <=n ; i++) {
            System.out.print(fibonacci(i)+" ");
        }

    }

    private static long fibonacci(int n) {

        if (n <= 1) {
            return n;
        }
        if(fibonacciCache[n]!=0){
            return fibonacciCache[n];
        }
        long nthFibonacciNumber = fibonacci(n-1) + fibonacci(n - 2);
        fibonacciCache[n] = nthFibonacciNumber;
            return nthFibonacciNumber;

    }

}
// The fibonacci sequence is a famous bit of mathematics,
// and it happens to have a recursive definition.
// The first two values in the sequence are 0 and 1 (essentially 2 base cases).
// Each subsequent value is the sum of the previous two values,
// so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
// Define a recursive fibonacci(n) method that
// returns the nth fibonacci number,
// with n=0 representing the start of the sequence.
// The method should be able to handle invalid input (e.g. negative numbers)

//import java.util.HashMap;
//
//public class MemoizationExample {
//
//    private static HashMap<Integer, Integer> memo = new HashMap<>();
//
//    public static int fibonacci(int n) {
//        if (memo.containsKey(n)) {
//            return memo.get(n);
//        }
//
//        if (n <= 1) {
//            return n;
//        } else {
//            int result = fibonacci(n - 1) + fibonacci(n - 2);
//            memo.put(n, result);
//            return result;
//        }
//    }
//
//    public static void main(String[] args) {
//        int n = 6;
//        int fib = fibonacci(n);
//        System.out.println("Число Фибоначчи для " + n + ": " + fib);
//    }
//}
