package org.example;


public class TaskSwap {
    public static void main(String[]args){
        int value1 = 6668474;
        int value2 = 555489877;

        System.out.println("val1=" + value1 + ", val2=" + value2);


        //TODO
        int value1old = value1;

        value1 = value2;
        value2 = value1old;
        System.out.println("val1=" + value1 + ", val2=" + value2);

        String s = "AAACCCBBB";

        String s1 = s.replace("AAACCCBBB","BBBCCCAAA");


        //void replace(String s, String s1 ){}

        //s.replace("A", "X");

        //TODO s = "BBBCCCAAA"

        System.out.println("s " + s);
        System.out.println("s1 " + s1);

                        // other ways:
        System.out.println(s.replace("A","X").replace("B","A").replace("X", "B"));


        //TODO
        //ukol do promenne a ulozit hodnotu = suma cisel od 1 do 200
        //1 + 2 + 3 .....
        //for cyklus

        //TODO
        //nastuodvat array
        //vytvorit array int s 5 elementy, nastavit do nej nejaka cisla, na kazdy element
        // napsat kod ktery zjisti, jestli v arrayi existuje element i == 5 a vysledek true/false ulozit do promenne


    }
}