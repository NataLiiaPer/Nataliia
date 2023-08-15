public class NestedLoop22 {
    public static void main(String[] args) {
        int height = 5;

        for (int row = 0; row < height; row++) {
            if (row == 0) {
                for (int number = 1; number < height - row; number++) {
                    System.out.print(number);
                }
            }
            if (row != 0) {
                for (int number = 1; number <= height - row; number++) {

                    System.out.print(number);
                }
            }
            for (int space = 1; space <= row * 2 - 1; space++) {
                if (row != 0) {
                    System.out.print(" ");
                }
            }
            for (int number1 = height - row; number1 > 0; number1--) {

                System.out.print(number1);
            }
            System.out.println();
        }
    }
}


//        123454321
//        1234 4321
//        123   321
//        12     21
//        1       1