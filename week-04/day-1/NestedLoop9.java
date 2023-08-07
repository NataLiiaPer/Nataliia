public class NestedLoop9 {
    public static void main(String[] args) {
        int height = 5;
        for (int row = height; row > 0; row--) { //row = 5 height = 5
            for (int number = 1; number <= row; number++) { // number = 1 row = 5
                System.out.print(number);
            }
            System.out.println();
        }
    }
}

//        12345
//        1234
//        123
//        12
//        1