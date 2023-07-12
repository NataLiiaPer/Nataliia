

public class PassingArgumentsByValue {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("print first "+i);
        increment(i);
        System.out.println("print second "+i);
    }
    public static void increment(int i) {
        i++;
        System.out.println("print third "+i);
    }
}
