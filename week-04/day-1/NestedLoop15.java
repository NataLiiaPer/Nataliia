public class NestedLoop15 {
    public static void main(String[] args) {
        int height = 5;
        for (int row = 0; row < height; row++) {
            for (int asterix = 0; asterix <= row; asterix++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


//        *
//        * *
//        * * *
//        * * * *
//        * * * * *