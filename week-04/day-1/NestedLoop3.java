public class NestedLoop3 {
    public static void main(String[] args) {
int hight = 5;
        for (int row = 1; row <= hight; row++) { //row = 1; hight = 5;
            for (int number = 1; number <= row;number++) { //num = 1;row = 1
                if(row==1){
                    System.out.println(" ");
                }
                if(row>1)
                System.out.print(row);
            }
            System.out.println();
        }
    }
}
//        1
//        22
//        333
//        4444
//        55555