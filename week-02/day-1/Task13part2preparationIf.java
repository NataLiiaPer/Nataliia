package org.example;

public class Task13part2preparationIf {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        int number = a;

        if (number < 10) {
            System.out.println("less than 10");
        } else if (number >= 20 & number < 30) {
            System.out.println("more than 20, less than 30");

        } else if (number >= 30 & number < 100) {
            System.out.println("more than 30, less than 100");
        } else {
            System.out.println("more than 100");
        }


////////////////
        String neco = "a";
        if (neco.equals("a")) {
            System.out.println("string is a");
        } else {
            System.out.println("string is not a");
        }

    }
}
