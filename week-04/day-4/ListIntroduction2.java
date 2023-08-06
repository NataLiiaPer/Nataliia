import java.util.ArrayList;

public class ListIntroduction2 {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");
        ArrayList<String> listB = new ArrayList<>(listA); // ListB содержит значения listA
        System.out.println(listB.size());
        if (listA.contains("Durian")) { // проверяем содержит ли listA данный элемент
            System.out.println(true);
        }
        listB.remove("Durian");
        listA.add(4, "Kiwifruit"); // Add "Kiwifruit" to List A after the 4th element
        if (listA.equals(listB)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println(listA.indexOf("Avocado"));//  Get the index of "Avocado" from List A
        System.out.println(listB.indexOf("Durian")); //выводит -1 так как такого индекса нет
        ArrayList<String> newElements = new ArrayList<>();
        newElements.add("Passion Fruit");
        newElements.add("Pomelo");

        listB.addAll(newElements);
        System.out.println(listA.get(2));
        System.out.println(listA);
        System.out.println(listB);
//        Create a list ('List A') which contains the following values
//                Apple, Avocado, Blueberries, Durian, Lychee
//        Create a new list ('List B') with the values of List A
//        Print out whether List A contains "Durian" or not
//        Remove "Durian" from List B
//        Add "Kiwifruit" to List A after the 4th element
//        Compare the size of List A and List B
//        Get the index of "Avocado" from List A
//        Get the index of "Durian" from List B
//        Add "Passion Fruit" and "Pomelo" to List B in a single statement
//        Print out the 3rd element from List A
//        Print all elements of List A
//        Print all elements of List B
//        The full output of your main method should be the following:
//
//        true
//        false
//        1
//                -1
//        Blueberries
//                [Apple, Avocado, Blueberries, Durian, Kiwifruit, Lychee]
//[Apple, Avocado, Blueberries, Lychee, Passion Fruit, Pomelo]
    }
}
