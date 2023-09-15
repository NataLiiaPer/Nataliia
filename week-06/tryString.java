public class tryString {
    public static void main(String[] args) {
        String toReplace = "xyyyx";
        char target = 'x';
        char replace = 'y';
        System.out.println(replace(toReplace, target, replace));
    }

    public static String replace(String input, char target, char replace) {
        if (input.isEmpty()) {
            return input; //base case
        }
        char first = input.charAt(0);
        String theRest = input.substring(1);

        if (first == target) {
            first = replace;
        }

        return first+replace(theRest,target,replace);
        // y+replace(yyyx,x,y) y+ " "
        //y+replace(yyx,x,y)
        //y+replace(yx,x,y)
        //y+replace(x,x,y)
        //y+replace( ,x,y)

    }
}
