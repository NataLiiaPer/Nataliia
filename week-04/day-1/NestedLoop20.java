public class NestedLoop20 {
    public static void main(String[] args) {
        int height = 5;
        for (int row = 0; row <height; row++) {
            for (int space = 0; space <= height*2 - row*2; space++) {
                System.out.print(" ");
            }
            for (int asterix = 0; asterix <row*2+1; asterix++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


//               __________*
//               ________* * *
//                     * * * * *
//                   * * * * * * *
//                 * * * * * * * * *