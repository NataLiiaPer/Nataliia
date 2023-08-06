import java.util.HashMap;
import java.util.Map;

public class ProductDatabase2 {
    public static void main(String[] args) {

        HashMap<String, Integer> products = new HashMap<>();
          int max = 0;
     //     int i = 0;
//        int min = 0;
//        int sum = 0;
//        int counter = 0;
//        Float avarage = 0F;

        products.put("Eggs", 200);
        products.put("Milk", 200);
        products.put("Fish", 400);
        products.put("Apples", 150);
        products.put("Bread", 50);
        products.put("Chicken", 550);

        for (Integer i : products.values()) {
            if (i < 201) {

                System.out.println(i);
            }
        }
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            if (entry.getValue() < 201) {
                String key = entry.getKey();
                System.out.println(key); // whe the program prints it one time even it is inside the scope?
            }
        }

        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            if (entry.getValue() >150) {
                String key = entry.getKey();
                int value = entry.getValue();
                System.out.println(key + " "+ value);
            }
        }

     //   System.out.println(i);
//        We are going to represent our products in a map where the keys are strings
//        representing the product's name and the values are numbers representing the product's price.
//
//        Create a map with the following key-value pairs:
//
//        Product name (key)	Price (value)
//        Eggs	200
//        Milk	200
//        Fish	400
//        Apples	150
//        Bread	50
//        Chicken	550

//        Create an application which prints out the answers to the following questions:
//
//        Which products cost less than 201? (just the name)
//        Which products cost more than 150? (name + price)
//        The full output of your main method should be the following:
//
//        Apples
//                Eggs
//        Milk
//                Bread
//        Fish 400
//        Chicken 550
//        Eggs 200
//        Milk 200
//        NOTE: Your output lines may be in a different order as the HashMap API does not define
//        the order of iteration.
    }
}
