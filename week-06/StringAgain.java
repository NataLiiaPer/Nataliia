public class StringAgain {
    public static void main(String[] args) {
        String toReplace = "xyyyx";
        char target = 'x';
        System.out.println(deleteX(toReplace,target));

    }

    private static String deleteX(String input, char target) {
        if (input.isEmpty()) {
            return input;
        }
        char first = input.charAt(0);
        String theRest = input.substring(1);
        if (first == target) {
            return deleteX(theRest,target);

        }
        else {
           return first+deleteX(theRest,target);
        }

    }
}

// Given a string, write a recursive (no loops) method which returns
// a new string with the lowercase 'x' chars removed.