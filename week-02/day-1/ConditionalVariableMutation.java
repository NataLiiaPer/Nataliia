import java.util.Scanner;
public class ConditionalVariableMutation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        System.out.print("a = ");
        int a = scanner.nextInt();
        int output1 = 0;
        if(a%2==0){
        // if the value of 'a' is even increment output1 by one
            output1++;
        System.out.println("Output #1: " + output1);}

        System.out.println("Please enter an integer between 0 and 30: ");
        System.out.print("b = ");
        int b = scanner.nextInt();
        String output2 = "";
        if(10<b&&b<20){
            output2 = "Sweet!";
        }
        if(b<10){
            output2 = "Less!";
        }
        if(b>20){
            output2 = "More!";
        }
        // if b is between 10 and 20 set output2 to "Sweet!"
        // if less than 10 set output2 to "Less!",
        // if more than 20 set output2 to "More!"

        System.out.println("Output #2: " + output2);

        System.out.println("Please enter an integer between 0 and 100: ");
        System.out.print("credits = ");
        int credits = scanner.nextInt();

        System.out.println("Please enter a boolean (true/false): ");
        System.out.print("isBonus = ");
        boolean isBonus = scanner.nextBoolean();

        int output3 = 123;
        if(credits >= 20 && isBonus == false){
            output3+=3;
        }
        if(credits <50 && isBonus == false){
            output3+=1;
        }
        if(credits <50 && isBonus == false){
            output3+=1;
        }
        if( isBonus == true){


        // if credits are at least 50,
        // and isBonus is false decrement output3 by 2
        // if credits are smaller than 50,
        // and isBonus is false decrement output3 by 1
        // if isBonus is true output3 should remain the same

        System.out.println("Output #3: " + output3);}

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
