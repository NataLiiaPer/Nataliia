public class SumDigits2 {
    public static int findSum(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + findSum(n - 1);
        }
    }
            //1+0(findSum(0)
            //2+1(findSum(1)
            //3+3(findSum(2)
            //4+6(findSum(3)
            //5+10(findSum(4)
    public static void main(String[] args) {
        int n = 5; // Замените на нужное значение
        int sum = findSum(n);
        System.out.println("Сумма чисел от 1 до " + n + ": " + sum);
    }
}

