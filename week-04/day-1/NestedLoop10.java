public class NestedLoop10 {
    public static void main(String[] args) {
        int height = 5;
        int counter = 1;
        for (int row = 0; row < height; row++) {
            for (int x = 0; x <= height - row; x++) {
                System.out.print(" ");
            }

            for (int number = 1; number <= row+1; number++) {
                System.out.print(number);
            }

            for (int number1 = row; number1 <= row&&number1>0; number1--) {
                if(row==0){
                System.out.print("");}
                System.out.print(number1);
            }
         //   counter++;
            System.out.println();
        }
    }
}
//            _____1
//            ____12 1
//            ___123 21
//            __1234 321
//            _12345 4321