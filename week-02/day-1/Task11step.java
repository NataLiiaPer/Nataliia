package org.example;

public class Task11step {
    public static void main (String[]args) {
//print numbers from 90 to 10, step -7 and also print how many numbers it is and print their sum
        int i = 0;
        int sum = 0;
        int counter = 0;
for(i = 90;i>=10;i-=7){
    System.out.println(i);
    counter++;
    sum = i+sum;
}
        System.out.println("Sum = "+sum);
        System.out.println(counter);
    }
}
