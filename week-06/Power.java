public class Power { // this is another task!!! 5*4*3*2*1
    public static void main(String[] args) {
        int n = 5;
        int ans = calcfactorial(n);
        System.out.println(ans);
    }
    public static int calcfactorial(int n) {
        if (n==1||n==0) {
            return 1;
        }
        int fact_nm1 = calcfactorial(n-1);
        int fact_n = n*fact_nm1;

        // int fact_nm1 = calcfactorial(n-1); 1
        // int fact_n = n*fact_nm1; 1*1
        //2*1
        //3
        return fact_n;
    }
}


// Given base and n that are both 1 or more, write a recursive method (no loops)
// which returns the value of base to the n-th power, so powerN(3, 2) is 9 (3 squared).


//    public class Power {
//    public static void main(String[] args) {
//        int f= factorial(2,6);
//        System.out.println(f);
//    }
//    public static int factorial(int n, int counter) {
//        if (counter >= 1) {
//            return counter-1;
//            //    return n*n;
//        } else {
//            return 1;
//        }
//    }
//}