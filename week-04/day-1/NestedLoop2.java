public class NestedLoop2 {
    public static void main(String[] args) {
int hight = 4;
        for (int row = hight; row > 0; row--) {
            for (int number = 1; number <= row; number++) { // num = 1; row = 4
                System.out.print(number);
            }
            System.out.println();
        }
    }
}

//        output
//        1234
//        123
//        12
//        1