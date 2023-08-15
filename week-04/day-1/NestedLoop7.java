public class NestedLoop7 {
    public static void main(String[] args) {
        int height = 4;
        for (int row = 1; row <= height; row++) {
            for (int number = 1; number <= row; number++) {
                System.out.print(number);
                if (number!=row) {
                    System.out.print(1);
//                } else if (number == row) {
//                    System.out.print(row);
               }}
            System.out.println();
            }
        }
    }



//    Fibonacci Triangle
//        1
//        1 1
//        1 1 2
//        1 1 2 3
//        1 1 2 3 4
//        1 1 2 3 4 5