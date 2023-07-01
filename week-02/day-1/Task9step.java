public class Task9step {
    public static void main (String[]args) {
//print numbers from 2 to 100, step 3 and print how many numbers it is
        int i = 0;
        int counter = 0;
        for (i =2;i<=100;i+=3){
            counter++;
            System.out.println(i);
        }
        System.out.println("the mount of the numbers is "+counter);
    }
}
