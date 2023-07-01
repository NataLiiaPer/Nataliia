public class Task4 { public static void main (String[]args) {
    int counter = 0;
    int sum = 0;
    //task 4 print numbers 300 to 10, step -6, calculate how many numbers it is and store
    //   it in a variable and print and calculate their sum, store into variable and print.
    for(int i = 300;i>10;i-=6) {
        counter++; //counter = counter + 1
        sum += i;
        System.out.println(i);
    }
    System.out.println(counter);
    System.out.println(sum);
    }
}

