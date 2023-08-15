public class NestedLoop21 {
    public static void main(String[] args) {
        int height = 5;
        for (int row = 0; row < height; row++) {
            for (int space = 0; space <= row; space++) {
                System.out.print(" ");
            }
            for (int asterix = 0; asterix < height - row; asterix++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int row = 0; row < height; row++) {
            for (int space = 1; space < height - row; space++) {
                System.out.print(" ");
            }
            for (int asterix = 0; asterix <=row+1 ; asterix++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//        * * * * *
//         * * * *
//          * * *
//           * *
//            *
//           * *
//          * * *
//         * * * *
//        * * * * *