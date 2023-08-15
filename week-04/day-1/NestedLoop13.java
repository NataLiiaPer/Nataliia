public class NestedLoop13 {
    public static void main(String[] args) {
        int height = 5;
        for (int row = 0; row < height; row++) {
            for (int space = 0; space <height-row ; space++) {
                System.out.print(" ");
            }
            for (int number = row+1; number <=row*2+1; number++) {
                System.out.print(number);
            }
            for (int number1 = row*2; number1>row ; number1--) {
                if(row==0){
                    System.out.print(" ");
                }
                System.out.print(number1);
            }
            System.out.println();
        }
        }
    }
//            _____1
//                23 2
//               345 43
//              4567 654
//             56789 8765