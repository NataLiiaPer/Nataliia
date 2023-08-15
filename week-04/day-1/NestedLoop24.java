public class NestedLoop24 {
    public static void main(String[] args) {
        int height = 5;
        for (int row = 0; row <= height; row++) {
            for (int number = 0; number < height; number++) {
                if (row == 0 || row == height || number==0 ||number==4) {
                    System.out.print(1 + " ");
                }
                if (row != 0 && row != height&&number!=0&&number!=4) {
                    System.out.print(0 + " ");
                }

            }
            System.out.println();
        }
    }
}
//        1 1 1 1 1
//        1 0 0 0 1
//        1 0 0 0 1
//        1 0 0 0 1
//        1 1 1 1 1