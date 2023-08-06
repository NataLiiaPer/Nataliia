public class NestedLoop1 {
    public static void main(String[] args) {
        int height = 5;
        for (int row = 1; row <= height; row++) { // height = 4;row = 1
            for (int number = 1; number <= row; number++) {
                if (row > 1) {
                    System.out.print(number);
                }
                if (row == 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


//output

//        12
//        123
//        1234
//        12345