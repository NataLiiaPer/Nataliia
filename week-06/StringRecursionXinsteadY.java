public class StringRecursionXinsteadY {
    public static void main(String[] args) {
        String input = "xtttx";
        char target = 'x';
        char replacement = 'y';

        String result = replace(input, target, replacement);
        System.out.println(result); // output

    }

    public static String replace(String input, char target, char replacement) {
        if (input.isEmpty()) {
            return input;
        }
        char firstChar = input.charAt(0);
        String restOfString = input.substring(1);

        if (firstChar == target) {
            firstChar = replacement; // заменяем символ
        }

        return firstChar + replace(restOfString, target, replacement);
    }
}
// Given a string, write a recursive (no loops) method which returns
// a new string with the lowercase 'x' chars changed to 'y' chars.