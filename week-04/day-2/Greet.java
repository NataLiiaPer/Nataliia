public class Greet {
    public static void main(String[] args) {
        Greet greetMe = new Greet();
        greetMe.al = "Green Fox";
        greetMe.mam = "mommy";
        greetMe.greet();
    }
    String al;
    String mam;
    public void greet(){
        System.out.println("Greetings dear "+ al);
        System.out.println("Greetings dear "+ mam);
    }}


    //  From now on, create the usual class wrapper
//  and main method on your own

// - Create a class called Greet
// - Create a string variable named `al` and assign the value `Green Fox` to it
// - Create a function called `greet()` that greets its input parameter
//     - It prints a greeting message e.g. `Greetings dear Green Fox`
// - Greet `al`

