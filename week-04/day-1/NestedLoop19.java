public class NestedLoop19 {
    public static void main(String[] args) {
        int heigh1 = 3;
        int height2 = 2;

        for (int row = 0; row <=heigh1; row++) {
            for (int space = 0; space < heigh1-row; space++) {
                System.out.print(" ");
            }
            for (int asterix = 0; asterix < row; asterix++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 0; row < height2; row++) {
            for (int space = 0; space <= row; space++) {
                System.out.print(" ");
            }
            for (int asterix = 0; asterix < height2-row; asterix++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


//              *
//             * *
//            * * *

//             * *
//              *