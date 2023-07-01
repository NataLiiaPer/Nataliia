package org.example;

public class TaskFor {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i <= 200; i++) {
            a = a + i;
        }
        System.out.println("sum = " + a);
    }
}
