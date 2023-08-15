public class NestedLoop16 {
    public static void main(String[] args) {
        int heihgt = 5;
        for (int row = 0; row <=5 ; row++) {
            for (int asterix = 1; asterix <= heihgt-row; asterix++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

//        * * * * *
//        * * * *
//        * * *
//        * *
//        *