import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[] args) {

        int counter = 0;
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Number of elements in the ArrayList: " + names.size());

        names.add("William");
        if (names.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        names.add("John");
        names.add("Amanda");
        System.out.println("Number of elements in the ArrayList: " + names.size());
        System.out.println("the 3rd element the ArrayList: " + names.get(2));
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        for (int i = 0; i < names.size(); i++) { //Iterate through the list and print...
            counter++;
            System.out.println(counter + ". "+names.get(i));
        }
        names.remove(1);

        for (int i = names.size()-1; i >=0 ; i--) {
            System.out.println(names.get(i));
        }

        names.clear(); // удаляет сразу все элементы в ArrayList
        System.out.println(names.size());
    }
}


//    We are going to play with lists. Feel free to use the built-in methods where possible.
//
//        Create an empty list which will contain names (strings)
//        Print out the number of elements in the list
//        Add "William" to the list
//        Print out whether the list is empty or not
//        Add "John" to the list
//        Add "Amanda" to the list
//        Print out the number of elements in the list
//        Print out the 3rd element
//        Iterate through the list and print out each name
//        William
//        John
//        Amanda
//        Iterate through the list and print
//        1. William
//        2. John
//        3. Amanda
//        Remove the 2nd element
//        Iterate through the list in a reversed order and print out each name
//        Amanda
//        William
//        Remove all elements
//        Print out the number of elements in the list
//        The full output of your main method should be the following:
//
//        0
//        false
//        3
//        Amanda
//        William
//        John
//        Amanda
//        1. William
//        2. John
//        3. Amanda
//        Amanda
//        William
//        0