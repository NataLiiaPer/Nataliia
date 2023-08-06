import java.util.HashMap;
import java.util.Map;



public class ProductDatabase {
    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();
        int max = 0;
        int min = 0;
        int sum = 0;
        int counter = 0;

        Float avarage = 0F;
        products.put("Eggs", 200);
        products.put("Milk", 200);
        products.put("Fish", 400);
        products.put("Apples", 150);
        products.put("Bread", 50);
        products.put("Chicken", 550);

        System.out.println(products.get("Fish"));

//        for (Integer i : products.values()) { // why it doesn't work??? :(((
//          if (max <products.values(i)) {      // it was working in a ShoppingList2 task...
//              max = products.values(i);
//          }
//        }
//        System.out.println(max);

        for (Integer i : products.values()) {
            if (i > max) {
                max = i;
            }
        }
      //  System.out.println(max);

        for (Map.Entry<String, Integer> entry : products.entrySet()) { // I copied this part of code but
            if (entry.getValue() == max) {                     // I don't understand it (first line)
                String key = entry.getKey();
                System.out.println(key);
            }
        }

        for (Integer i : products.values()) {
            sum += i;
        }
        avarage = (float) (sum / products.size());
        System.out.println(avarage); // why my answer is 258.0 not 258.33334 ?

        for (Integer i : products.values()) {
            if (i < 300) {
                counter++;
            }
        }
        System.out.println(counter);

  //      for (Integer i : products.values()) {
        if(products.containsValue(125)==false)
        System.out.println("no");

        for (Integer i : products.values()) { // why the program takes values in a free order???
            if (i < products.get("Eggs")) {
                min = i;
            }
        }
        int theCheapest = min;
        for (Map.Entry<String, Integer> entry : products.entrySet()) { // I copied this part of code but
            if (entry.getValue() == theCheapest) {                     // I don't understand it (first line)
                String key = entry.getKey();
                System.out.println(key);
            }
        }


//        We are going to represent our products in a map where the keys are strings representing the
//        product's name and the values are numbers representing the product's price.
//
//        Create a products map with the following key-value pairs:
//
//        Product name (key)	Price (value)
//        Eggs	                 200
//        Milk	                 200
//        Fish	                 400
//        Apples	             150
//        Bread                  50
//        Chicken	             550
//        Create an application which prints out the answers to the following questions:
//
//        How much is the fish?
//                What is the most expensive product?
//                What is the average price?
//        How many products' price is below 300?
//        Is there anything we can buy for exactly 125?
//                What is the cheapest product?
//        The full output of your main method should be the following:
//
//        400
//        Chicken
//        258.33334
//        4
//        no
//                Bread
//        Autograder Bonus
//        Java: make the products map a class constant (declared as static final)
    }
}
