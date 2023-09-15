public class StringAgainAndAgain {
    public static void main(String[] args) {
        String toReplace = "Hello";
        char toAdd = '*';
        String result = addAstrix(toReplace, toAdd);
        System.out.println(result);

    }

    private static String addAstrix(String toReplace, char toAdd) {
        String result = addAstrixRec(toReplace, toAdd);
        int length = result.length();
        String finishResult = result.substring(0, length - 1);
        return finishResult;
    }

    private static String addAstrixRec(String input, char astrix) {
        if (input.isEmpty()) {
            return input;
        }
        char first = input.charAt(0);
        //    System.out.println(first);
        String theRest = input.substring(1);
        //   System.out.println(theRest);
        String result = "" + first + astrix; // "" !!!
        //System.out.print(result);
        return result + addAstrixRec(theRest, astrix);
    }

}

// Given a string, write a recursive (no loops) method which returns a new
// string with all adjacent chars separated by an `*`. Please note that there
// should be no trailing `*` at the end of the returned string. For example,
// the string `word` should be changed to `w*o*r*d`.