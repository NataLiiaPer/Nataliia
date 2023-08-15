public class NestedLoop25 {
    public static void main(String[] args) {
        int height = 5;
        for (int row = 1; row <= height; row++) {
            for (int line = 0; line < height; line++) {
                if (row == 1 || row == height) {
                    System.out.print("- ");
                }
                if (row != 1 && row != height && row % 2 != 0 && line % 2 != 0) {
                    System.out.print("+ ");

                }
                if (row != 1 && row != height && row % 2 != 0 && line % 2 == 0) {
                    System.out.print("- ");

                }

                if (row != height && row % 2 == 0 && line % 2 != 0) {
                    System.out.print("- ");
                }
                if (row != height && row % 2 == 0 && line % 2 == 0) {
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }

    }
}

//        - - - - -
//        + - + - +
//        - + - + -
//        + - + - +
//        - - - - -