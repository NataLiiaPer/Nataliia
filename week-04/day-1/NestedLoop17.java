public class NestedLoop17 {
    public static void main(String[] args) {
        int height = 5;
        for (int row = 0; row <= height; row++) {
            for (int space = 0; space <height-row ; space++) {
                System.out.print(" ");
            }
            for (int asterix = 1; asterix <=row ; asterix++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//                 *
//                * *
//               * * *
//              * * * *
//             * * * * *