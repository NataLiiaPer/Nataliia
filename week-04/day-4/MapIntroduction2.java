import java.util.HashMap;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap fun = new HashMap();
        fun.put("978-1-60309-452-8", "A Letter to Jo");
        fun.put("978-1-60309-459-7", "Lupus");
        fun.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        fun.put("978-1-60309-461-0", "The Lab");

        fun.remove("978-1-60309-459-7", "Lupus");
        fun.remove("978-1-60309-444-3", "Red Panda and Moon Bear");
        fun.remove("978-1-60309-461-0", "The Lab");

        fun.put("978-1-60309-459-7", "Lupus"); //output in the task must be another. I think,there should be a different sequence
        fun.put("978-1-60309-444-3", "Red Panda and Moon Bear"); // and I don't know why I've got this result...
        fun.put("978-1-60309-461-0", "The Lab");


//        fun.replace("978-1-60309-459-7","Lupus","Red Panda and Moon Bear"); try to replace
//        fun.replace("978-1-60309-444-3","Red Panda and Moon Bear","Lupus");


        for (java.lang.Object key : fun.keySet()) { // I just copy this pert of the code...
            String value = (String) fun.get(key); // I just copy this pert of the code...
            System.out.println(value + " (ISBN: " + key + " )");
        }
        fun.remove(978 - 1 - 60309 - 444 - 3);
        fun.remove("978-1-60309-461-0", "The Lab");

        fun.put("978-1-60309-450-4", "They Called Us Enemy");
        fun.put("978-1-60309-453-5", "Why Did We Trust Him?");
        System.out.println(fun.containsKey("478-0-61159-424-8"));
        System.out.println(fun.get("978-1-60309-453-5"));
    }
}
//    Create a map where the keys are strings and the values are strings with the following initial values
//
//    Key	Value
//978-1-60309-452-8	A Letter to Jo
//978-1-60309-459-7	Lupus
//978-1-60309-444-3	Red Panda and Moon Bear
//978-1-60309-461-0	The Lab
//    Print all the key-value pairs in the following format
//
//    A Letter to Jo (ISBN: 978-1-60309-452-8)
//    Lupus (ISBN: 978-1-60309-459-7)
//    Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
//    The Lab (ISBN: 978-1-60309-461-0)

//    Remove the key-value pair with key 978-1-60309-444-3
//
//    Remove the key-value pair with value The Lab
//
//    Add the following key-value pairs to the map
//
//    Key	Value
//978-1-60309-450-4	They Called Us Enemy
//978-1-60309-453-5	Why Did We Trust Him?
//    Print whether there is an associated value with key 478-0-61159-424-8 or not
//
//    Print the value associated with key 978-1-60309-453-5
//
//    The full output of your main method should be the following:
//
//    A Letter to Jo (ISBN: 978-1-60309-452-8)
//    Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
//    Lupus (ISBN: 978-1-60309-459-7)
//    The Lab (ISBN: 978-1-60309-461-0)
//false
//    Why Did We Trust Him?

