import java.util.HashMap;
import java.util.Map;

public class MapIntroduction {
    public static void main(String[] args) {


        HashMap happy = new HashMap();

        if (happy.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        happy.put(97,"a");
        happy.put(98,"b");
        happy.put(99,"c");
        happy.put(65,"A");
        happy.put(66,"B");
        happy.put(67,"C");

        System.out.println(happy);
        System.out.println(happy.keySet());
        System.out.println(happy.values());
        happy.put(68,"D");
        System.out.println(happy.size());
        System.out.println(happy.get(99));
        happy.remove(97);
        if (happy.size() == 100) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        happy.clear();
        System.out.println(happy.size());

//    We are going to play with maps. Feel free to use the built-in methods where possible.
//
//    Create an empty map where the keys are integers and the values are characters
//    Print out whether the map is empty or not
//    Add the following key-value pairs to the map
//   Key	Value
//   97	      a
//   98	      b
//   99	      c
//   65	      A
//   66	      B
//   67	      C
//    Print all the keys
//    Print all the values
//    Add value D with the key 68
//    Print how many key-value pairs are in the map
//    Print the value that is associated with key 99
//    Remove the key-value pair with key 97
//    Print whether there is an associated value with key 100 or not
//    Remove all the key-value pairs
//    Print how many key-value pairs are in the map
//    The full output of your main method should be the following:
//
//            true
//            [97, 65, 98, 66, 99, 67]
//            [a, A, b, B, c, C]
//            7
//            c
//            false
//            0
    }
}
