public class PassingArgByValue2 {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("i = " + i);
        change_i(i);
        System.out.println("i = " + i);
    }
        public static void change_i(int i){
            i++;
            System.out.println("new"+i);

        }
    }

