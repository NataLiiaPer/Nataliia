public class NestedLoop8 {
    public static void main(String[] args) {

        for (int row = 0; row <= 5; row++) {
            for (int space = 0; space < 5-row ; space++) {
                System.out.print(" ");}
                for (int number = 1; number <= row; number++) {
                    System.out.print(number);
                }
            System.out.println();
            }

        }
    }


//            _____1
//                12
//               123
//              1234
//             12345