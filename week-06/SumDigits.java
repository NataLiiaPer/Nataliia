public class SumDigits {
    public static void main(String[] args) {
        int f = sumDigit(123);
        System.out.println(f);
    }

    public static int sumDigit(int n) {
        if (n >= 1) {

            int lastDigit = n % 10;//12   6 2
            int firstDigit = n / 10; //12  1

            int sum = lastDigit + sumDigit(firstDigit);
            //6+sumDigit(12) //6+3
            //2+(1) //2+1
            //1+0

            //6+1
            //6+0


            return sum;
        } else {
            return 0;
        }
    }
}
// Given a non-negative integer n, return the sum of its digits recursively
// (without loops).
//
// Hint
//
// Mod (%) by 10 yields the rightmost digit (e.g. 1 % 10 is 6)
//
// Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).

//12/

//
// vezmi posledni cislo -> 126 % 10= 6
// 6 + sumDigits(126/10)


//    public static void main(String[] args) {
//        printSum(1, 2, 0);
//    }

