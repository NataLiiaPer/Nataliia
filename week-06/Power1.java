public class Power1 {
    public static void main(String[] args) {
        int n = 3;
        int ans = calcfactorial(n);
        System.out.println(ans);
    }
    public static int calcfactorial(int n) {
        if (n<=1) {
            int baseCase = 3;
            return baseCase;
        }
        int count = calcfactorial(n - 1);// 10
        int result = calcfactorial(1) * count;


        //2+findSumEars(3)3*27
        //2+findSumEars(2) 3*9
        //2+findSumEars(1) 3*3
        return result;
    }
}
// Given base and n that are both 1 or more, write a recursive method (no loops)
// which returns the value of base to the n-th power, so powerN(3, 2) is 9 (3 squared).