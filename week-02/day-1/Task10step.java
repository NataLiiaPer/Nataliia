public class Task10step {
    public static void main (String[]args) {
//print numbers from 4 to 100, step 5 and print their sum
        int sum = 0;
        for (int i = 4;i<=100;i+=5){
            sum = sum+i;
            System.out.println(i);
        }
        System.out.println(sum);
    }
}
