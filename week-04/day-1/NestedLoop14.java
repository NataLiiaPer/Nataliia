public class NestedLoop14 {
    public static void main(String[] args) {
        int hight = 5;
        for (int row = 1; row <=hight; row++) {
            for (int space = 0; space <hight+1-row ; space++) {
                System.out.print(" ");
            }
            for (int number = 1; number <=row;number++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }

    }
}

//            _____1
//                2 2
//               3 3 3
//              4 4 4 4
//             5 5 5 5 5