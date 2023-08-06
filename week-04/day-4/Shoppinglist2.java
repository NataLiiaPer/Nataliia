import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class Shoppinglist2 {
    public static void main(String[] args) {

        HashMap <String, Float>price = new HashMap<>();
        price.put("Milk", 1.07F);
        price.put("Rice", 1.59F);
        price.put("Eggs", 3.14F);
        price.put("Cheese", 12.60F);
        price.put("Chicken Breasts", 9.40F);
        price.put("Apples", 2.31F);
        price.put("Tomato", 2.58F);
        price.put("Potato", 1.75F);
        price.put("Onion", 1.10F);

//        HashMap <String, Float> price1 = new HashMap<>(price); does it make sense?
//        price1.remove("Onion");
//       Float bobPay = price1.values() * bob.values(); is it possible???

        HashMap<String, Integer> bob = new HashMap<>();
        int sum1 = 0;
        int sum2 = 0;
        bob.put("Milk", 3);
        bob.put("Rice", 2);
        bob.put("Eggs", 2);
        bob.put("Cheese", 1);
        bob.put("Chicken Breasts", 4);
        bob.put("Apples", 1);
        bob.put("Tomato", 2);
        bob.put("Potato", 1);

//        How much does Bob pay?

        Float bobPay = bob.get("Milk")*price.get("Milk")+bob.get("Rice")*price.get("Rice")
                +bob.get("Eggs")*price.get("Eggs")+bob.get("Cheese")*price.get("Cheese")
                +bob.get("Chicken Breasts")*price.get("Chicken Breasts")+bob.get("Apples")*price.get("Apples")
                +bob.get("Tomato")*price.get("Tomato")+bob.get("Potato")*price.get("Potato");

        System.out.println(bobPay);

//        Set<Integer> equivalentValues = new HashSet<>(); does it make sense?

//        for (Float value : price.values()) {
//            if (bob.containsValue(value)) {
//                equivalentValues.add(value);
//            }
//        }
//        System.out.println(equivalentValues);

        HashMap<String, Integer> alice = new HashMap<>();
        alice.put("Rice", 1);
        alice.put("Eggs", 5);
        alice.put("Chicken Breasts", 2);
        alice.put("Apples", 1);
        alice.put("Tomato", 10);

//        How much does Alice pay?

        Float alicePay = alice.get("Rice")*price.get("Rice")
                +alice.get("Eggs")*price.get("Eggs")
                +alice.get("Chicken Breasts")*price.get("Chicken Breasts")+alice.get("Apples")*price.get("Apples")
                +alice.get("Tomato")*price.get("Tomato");
        System.out.println(alicePay);

        //        Who buys more Rice?

        if (bob.get("Rice") > alice.get("Rice")) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }

//        Who buys more Potato?

        if (bob.get("Potato") > 0 && alice.containsKey("Potato")) {
            System.out.println("check Alice");
        } else {
            System.out.println("Bob");
        }

        //        Who buys more Ham?

        if (bob.containsKey("Ham") && alice.containsKey("Ham")) {
            System.out.println("check both again");
        } else {
            System.out.println("no one");
        }

//        Who buys more Apples?

        if (((bob.containsKey("Apples")) && alice.containsKey("Apples")) && (bob.get("Apples") == alice.get("Apples"))) {
            System.out.println("no one");
            if (bob.get("Apples") > alice.get("Apples")) {
                System.out.println("Bob");
            }

            //        Who buys more of different products?

            if (bob.size() > alice.size()) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }

            for (Integer i : bob.values()) {
                sum1 += i;
            }
            System.out.println(sum1);
            for (Integer i : alice.values()) {
                sum2 += i;
            }
            System.out.println(sum2);
            if (sum1 > sum2) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");

//        Represent the following products with their prices:
//
//        Product	Price
//        Milk	1.07
//        Rice	1.59
//        Eggs	3.14
//        Cheese	12.60
//        Chicken Breasts	9.40
//        Apples	2.31
//        Tomato	2.58
//        Potato	1.75
//        Onion	1.10

//        Represent Bob's shopping list:
//
//        Product	Amount
//        Milk	3
//        Rice	2
//        Eggs	2
//        Cheese	1
//        Chicken Breasts	4
//        Apples	1
//        Tomato	2
//        Potato	1

//        Represent Alice's shopping list:
//
//        Product	Amount
//        Rice	1
//        Eggs	5
//        Chicken Breasts	2
//        Apples	1
//        Tomato	10


//        Create an application which prints out the answers to the following questions:
//
//        How much does Bob pay?
//        How much does Alice pay?
//        Who buys more Rice?
//        Who buys more Potato?
//        Who buys more Ham?
//        Who buys more Apples?
//        Who buys more of different products?
//        Who buys more items? (more pieces)
//        The full output of your main method should be the following:
//
//        72.09
//        64.2
//        Bob
//        Bob
//        no one
//        no one
//        Bob
//        Alice
            }
        }
    }
}
