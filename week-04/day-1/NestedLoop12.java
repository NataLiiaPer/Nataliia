public class NestedLoop12 {
    public static void main(String[] args) {
        int height = 5;
        for (int row = 0; row <= height; row++) {
            for (int i = 0; i < height-row; i++) {
                System.out.print("  ");
            }
            for (int number = row; number <= row + 1&&number>=0; number--) {
                System.out.print(number + " ");
            }
            for (int number1 = 1; number1 <= row; number1++) {
                if (row == 0) {
                    System.out.println();
                }
                System.out.print(number1+" ");
            }
            System.out.println();
        }
    }
}

//        _ _ _ _ _ _ 0
//                  1 0  1
//                2 1 0  1 2
//              3 2 1 0  1 2 3
//            4 3 2 1 0  1 2 3 4
//          5 4 3 2 1 0  1 2 3 4 5