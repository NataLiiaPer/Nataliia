import java.util.ArrayList;
import java.lang.Object;

public class Candyshop {
    public static void main(String... args) {

        ArrayList<Object> sweets = new ArrayList<>();
        sweets.add("Cupcake");
        sweets.add(2);
        sweets.add("Brownie");
        sweets.add(false);

       String one =  "Croissant";
        String two =  "Ice cream";
     //   repairSweetList();
//        sweets.set(1, "Croissant");
//        sweets.set(3, "Ice cream");
        System.out.println(repairSweetList(sweets,one,two,1,3));

    }
    public static ArrayList repairSweetList(ArrayList<Object> array, String a,String b, int x,int y){

        array.set(x, a);
        array.set(y, b);
        return array;
    }
}



// Accidentally we added "2" and "false" to the sweets list
// Your task is to change the "2" to "Croissant" and the "false" to "Ice cream"
// No, don't just edit the lines above! :)
// Create a method called "repairSweetList()" which takes the list as a parameter
// and returns a list with the items "2" and "false" replaced (with "Croissant" and "Ice cream")

// Expected output: [Cupcake, Croissant, Brownie, Ice cream]
//    System.out.println(repairSweetList(sweets));


