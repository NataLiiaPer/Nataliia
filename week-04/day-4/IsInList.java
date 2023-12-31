import java.util.*;

public class IsInList {
    public static void main(String... args) {

        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16);
        List<Integer> haystack = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21);
        List<Integer> needles = Arrays.asList(1, 3, 13);
        // Write a method called `checkNumbers` (with a list of numbers as a parameter), which will return `true`
        // if the list `numbers` contains all the following elements: 4, 8, 12, 16; `false` otherwise.

        // The output should be "true"
        System.out.println(checkNumbers(numbers));
        System.out.println(checkAllNumbers(haystack, needles));
    }

    public static boolean checkNumbers(List<Integer> numbers1) {
        List<Integer> elementsToCheck = Arrays.asList(4,8,12,16);
        if (numbers1.containsAll(elementsToCheck)) {

        }
        return true;
    }

    public static boolean checkAllNumbers(List<Integer> numbers1,List<Integer> numbers2){
        if (numbers1.containsAll(numbers2)) {

        }
        return true;
    }
}

// Bonus: write a method called `checkAllNumbers` with 2 lists as parameters, which will return `true`
// if the first list contains all the elements of the second list; `false` otherwise.
//            List<Integer> haystack = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21);
//            List<Integer> needles = Arrays.asList(1, 3, 13);
//
//            // The output should be "true"
//            System.out.println(checkAllNumbers(haystack, needles));
//        }
//    }
//}
