import java.util.Scanner;

public class Input {
    public static void main(String[]args){
        //String string = "xxx"; // пакет java.lang, в нем классы уже импорированы
        Scanner s = new Scanner(System.in); // java.util. класс Scanner надо импор-ть, System.in - станд-й поток входных данных
        System.out.println("write something");
        System.out.println("write any number");
        String string = s.nextLine(); /* у объекта класса Scanner вызвали метод nextLine
        который читает с клавиатуры одну строчку чего-нибудь */
        int x = s.nextInt();
        System.out.println("you wright "+ string);
        System.out.println("you wright "+ x);
    }

}
