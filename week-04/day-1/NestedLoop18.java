public class NestedLoop18 {
    public static void main(String[] args) {
    int height = 5;
        for (int row = 0; row <height ; row++) {
            for (int space = 0; space <row; space++) {
                System.out.print(" ");
            }
            for (int asterix = height-row; asterix>0; asterix--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

//         * * * * *
//          * * * *
//           * * *
//            * *
//             *