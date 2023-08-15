public class NestedLoop23 {
    public static void main(String[] args) {
        int height = 5;
        int counter = 0;
        for (int row = 0; row < height; row++) {
            for (int number = 1; number < height; number++) {
                counter++;
                if (counter == height * 2) {
                    counter = 0;
                }
                System.out.print(counter);
            }
            System.out.println();
        }
    }
}

//        1234
//        5678
//        9012
//        3456
//        7890