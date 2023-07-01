package org.example;

public class Task13if {

    public static void main(String[] args) {
//take numbers from 1 to 100, step 1.
        //for each number decide if:
        /*
        the number is divisible by 2, print "i is divisible by 2"
        the number is divisible by 5, print "i is divisible by 5"
        the number is divisibile by 10, print "i is divisible by 10"
        for each number print only once (for example for 10, only print is divisible by 10)

       */

        for (int i = 1; i <= 100; i++) {

              if ( i% 10 == 0) {

                System.out.println(i + " is divisible by 10");}
                 else if ( i % 5 == 0) {
                    System.out.println(i + " is divisible by 5");
                }
                else if (i % 2 == 0) {
                System.out.println(i + " is divisible by 2");
            }
            }
        }
    }

