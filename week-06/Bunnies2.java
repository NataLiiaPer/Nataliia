public class Bunnies2 {
    public static int findSumEars(int n) {
        System.out.println(n);
        if (n >0&&n%2!=0) {
            int count = findSumEars(n - 1);
            int result1 = 2 + count;
            return result1;

//            int odd = 2;
//            return odd; //base case
        }
        else  {
            int count = findSumEars(n - 1);// 10
            int result2 = 3 + count;
            return result2;
//            int odd1 = 3;
//            return odd1; //base case
        }
//        int count = findSumEars(n - 1);// 10
//        int result = findSumEars() + count;
   //    return result1+result2;

        //2+findSumEars(4)2+8
        //2+findSumEars(3) 2+6
        //2+findSumEars(2) 2+4
        //2+findSumEars(1) 2+2

    }

    public static void main(String[] args) {
        // int bunny = 5; // Замените на нужное значение
        int sum = findSumEars(5);

        System.out.println("Total number of ears " + sum);
    }
}

// We have bunnies standing in a line numbered as 1, 2, ... The "odd" bunnies
// (1, 3, ...) have the usual number of ears = 2. However, the even bunnies
// (2, 4, ...) have 3 ears each (because they have a raised foot). Write
// a recursive method which accepts the number of bunnies as a parameter
// and returns the total number of "ears" in the bunny line. The method should be
// able to handle invalid input (e.g. negative numbers).