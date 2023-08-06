import java.util.Scanner;
public class task0 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // start coding here
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int x = 1;
            for(int i = a;i<=b;i++){
                x*=i;
            }
            System.out.println(x);
        }
    }

