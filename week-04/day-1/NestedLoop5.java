public class NestedLoop5 {
    public static void main(String[] args) {
      int row = 5;
      int x = 1;
        int number = 1;
      //  int[][] multidimensionalArray = new int[5][number];

        for (int i = 1; i < row; i++) {

            for ( number = 1; number <= i; number++) {
            //    x=number;
                System.out.print(number);
            }
           // x=number;
            System.out.println();
        }
}}
//       x=1
//        1        number = row
//        2  3    number =  row
//        4  5  6   row+(row-x)
//        7  8  9  10   row +(row-x)
//        11 12 13 14 15 row + (row-x)



//       16 17 18 19 20 21 row + (row-x)
//       22 23 24 25 26 27 28 row + 15

    //   int number = 1;
//    int x = 0;
//        for (int row = 1; row < height; row++) { //row = 1;height = 5
//        for (int number = 1; number < row+number; number++) { //number = 1
//        x=number;
//        System.out.print(number);
//        }
//        // x=number;
//        System.out.println();
//        }