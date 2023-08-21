public class Bunnies {
    public static int findSumEars(int n) {
        System.out.println(n);
        if (n == 1) {
            return 2; //base case
        }
        int count = findSumEars(n - 1);// 10
        int result = 2 + count;
        return result;

        //2+findSumEars(4)2+8
        //2+findSumEars(3)2++6
        //2+findSumEars(2) 2+4
        //2+findSumEars(1) 2+2


        // int result = (2*findSumEars(count));
        //findSumEars(1)==1                      //int result = n *2 + findSumEars(n - 1);
        // findSumEars(2)==2*1 findSumEars(1)==2 // 2*1findSumEars(1)-1==1
        //findSumEars(3)==2*2 findSumEars(2)==4  // 2*1findSumEars(1)-1==2
        //findSumEars(4)==2*4 findSumEars(3)==8  // 2*1findSumEars(1)-1==2
        //findSumEars(5)==2*8 findSumEars(4)==16  // 2*1findSumEars(1)-1==2

        //     System.out.println(n);
//            System.out.println(result);
//            return result;

        //  }
    }

    public static void main(String[] args) {
        // int bunny = 5; // Замените на нужное значение
        int sum = findSumEars(5);

        System.out.println("Total number of ears " + sum);
    }
}


// We have a number of bunnies and each bunny has two big floppy ears. Write
// a recursive method (no loops or multiplication) which takes the number of
// bunnies as its sole parameter and returns the total number of ears
// the bunnies have. The method should be able to handle invalid input
// (e.g. negative numbers)