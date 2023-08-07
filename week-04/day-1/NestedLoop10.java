public class NestedLoop10 {
    public static void main(String[] args) {
        int height = 5;
        for (int row = 1; row < height; row++) {
            for (int space = 1; space < row; space++) {
                System.out.println("_");
            }
        }
        for (int row = 1; row < height; row++) {
            for (int number = 1; number < row; number++) {
                System.out.println(number);
            }
        }
        System.out.println();
    }
}
//            _____1
//                121
//               12321
//              1234321
//             123454321