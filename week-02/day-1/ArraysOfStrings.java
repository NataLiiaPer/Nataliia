package org.example;

public class ArraysOfStrings {
    public static void main(String[]args){
        int [] numbers = new int[5];
        numbers[0] = 10;
        String[] strings = new String[3];
        strings[0]="Hi";//First element of array
        strings[1]="Bye";
        strings[2]="Java";
        System.out.println(strings[0]);
        System.out.println(strings[2]);
        for(int i=0;i< strings.length;i++)
        {
            System.out.println(strings[i]);
        }
        System.out.println(); // пустая строка(empty string)
        for (String string:strings) // первое слово(String) - тип данных, 2ое слово - переменная (название м.б. любое)
        {
            System.out.println(string);//третье слово массив, через оторый мы хотим проходить
        }
        int [] numbers1 = {1,5,7};
        int sum = 0;
        for(int x:numbers1)
        { sum=sum+x;}
        System.out.println();
            System.out.println(sum);
        int value = 0; // 32 bite memory
        String s = null; // empty, переменная s ни на что не ссылается
        String s1 = "sss"; // в памяти выделено мето на ссылку
        System.out.println(s);
        }
    }

