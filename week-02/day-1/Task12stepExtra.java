package org.example;

public class Task12stepExtra {
    public static void main(String[] args) {
//for numbers from 1 to 100, step 3 do:
// 1. take all numbers that are divisible by 2, print their sum like "sum of numbers from 1 to 100, step
/* 3, divisible by 2 is xxxx"

2. take all numbers that are divisible by 5, print how many numbers it is like "there are xxx numbers
that are divisible by 5 between 1 to 100, step 3
 */
        int i = 0;
        int sumDivByTwo = 0;
        int counterDivByFive = 0;
        for (i = 1; i <= 100; i += 3) {
            if (i % 2 == 0) {
                sumDivByTwo = sumDivByTwo + i;
            }

            if (i % 5 == 0) {
                counterDivByFive = counterDivByFive + 1;
            }
        }
        System.out.println("sum of numbers from 1 to 100, step " +
                " 3, divisible by 2 is " + sumDivByTwo);

        System.out.println("there are " + counterDivByFive + " numbers that are divisible by 5 between 1 to 100, step 3");

    }
}
