import java.util.Scanner;

public class try4 {
    public static void main(String[] args){

        System.out.println("Please provide an integer.");
        Scanner scanner  = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++){
            if (i == 0 || i == input -1){
                for(int j = 0; j < input; j++){
                    System.out.print("%");
                    if (j == input - 1){
                        System.out.print("\n");
                    }
                }
            }}}}