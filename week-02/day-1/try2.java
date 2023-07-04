import java.util.Scanner;

public class try2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter an integer between 0 and 50: ");
        System.out.print("d = ");
    int d = scanner.nextInt();

        System.out.println("Please enter an integer between 0 and 500: ");
        System.out.print("time = ");
    int time = scanner.nextInt();

    String output4 = "";
        if(d%4==0 && time<200){
        output4 = "Check";
    }
        if(time>200){
        output4 = "Time out";
    }
        else {output4 = "Run Forest Run!";}
    // if d is dividable by 4 and time is not more than 200
    // set output4 to "Check"
    // if time is more than 200
    // set output4 to "Time out"
    // otherwise set output4 to "Run Forest Run!"

        System.out.println("Output #4: " + output4);
}
}

