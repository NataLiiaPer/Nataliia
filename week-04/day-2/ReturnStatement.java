public class ReturnStatement {
    public static void main(String[] args) {
    String shouting = caps("Why are you reading my diary???");
        System.out.println(shouting);
        int [] awesomeArray = giveMeArrayFromInts(3,7,1);
        System.out.println(awesomeArray[0]);
    printMessage();
    int sum = add(5,4);
        System.out.println(sum);
    }
    public static void printMessage() {
        System.out.println("This is our first method!");
    }

    public static int add (int a,int b) {
        return a+b;
    }

    public static String caps(String s) {

        return s.toUpperCase();
    }

    public static int[]giveMeArrayFromInts(int a,int b, int c){
        int[]array = new int[3];
        array [0] = a;
        array [1] = b;
        array [2] = c;
        return array;
    }
}
