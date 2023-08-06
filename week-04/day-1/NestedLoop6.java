public class NestedLoop6 {
    public static void main(String[] args) {
        int height = 5;
        for (int row = height; row >0; row--) {
            for (int number = row; number > 0; number--) {
                System.out.print(number);
            }
            System.out.println();
        }

    }
}
//        5 4 3 2 1
//        4 3 2 1
//        3 2 1
//        2 1
//        1