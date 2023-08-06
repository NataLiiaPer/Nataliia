import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("eggs");
        names.add("milk");
        names.add("fish");
        names.add("apples");
        names.add("bread");
        names.add("chicken");

        if (names.contains("milk")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        if (names.contains("bananas")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
//    We are going to represent a shopping list by a list containing strings.
//
//    Create a list with the following items:
//    eggs, milk, fish, apples, bread and chicken
//    Create an application which prints out the answers to the following questions:
//    Do we have milk in the shopping list? (yes/no)
//    Do we have bananas in the shopping list? (yes/no)
//    The full output of your main method should be the following:
//
//    yes
//            no
    }
}
