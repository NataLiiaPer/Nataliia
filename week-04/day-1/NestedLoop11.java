public class NestedLoop11 {
    public static void main(String[] args) {
        int height = 5;
        int height1 = 4;
        int counter = 5;
        for (int row = 1; row <= height; row++) {
            for (int number = 1; number <= row; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
        for (int row = 1; row <= height1; row++) {
            for (int number = 1; number < counter; number++) {
                System.out.print(number);
            }
            counter--;
            System.out.println();
        }

    }

}

//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1