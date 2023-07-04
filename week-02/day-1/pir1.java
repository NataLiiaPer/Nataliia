public class pir1 {
    public static void main(String[] args){

        int height = 5;

        for(int i = 0;i <height;i++){
            for(int x = 0;x <=height-i;x++){
                System.out.print(" ");
            }
            for(int j = 1;j <=i*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

