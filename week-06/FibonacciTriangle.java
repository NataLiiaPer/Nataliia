public class FibonacciTriangle {
    public static void main(String[] args) {
    int hight = 4;
        for (int row = 0; row < hight; row++) {
            for (int j = 1; j < row; j++) {
                if(j==1){
                    System.out.print(1);
                }
                  else {
                    System.out.print(j+j+row);
                }
            }
            System.out.println();
        }

    }
}
//        1
//        1 1
//        1 1 2
//        1 1 2 3
//        1 1 2 3 5
//j=1+row;j=1+row;
//j=