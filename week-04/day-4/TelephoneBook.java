import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        HashMap<String, String> telephoneBook = new HashMap<>();
        telephoneBook.put("William A. Lathan", "405-709-1865");
        telephoneBook.put("John K. Miller", "402-247-8568");
        telephoneBook.put("Hortensia E. Foster", "606-481-6467");
        telephoneBook.put("Amanda D. Newland", "319-243-5613");
        telephoneBook.put("Brooke P. Askew", "307-687-2982");
        System.out.println(telephoneBook.get("John K. Miller"));

        if (telephoneBook.containsKey("Chris E. Myers") == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

//telephoneBook.get()

        String valueToFind = "307-687-2982";
//        public static <K, V > K getKeyFromValue(Map < K, V > map, V value) {

//            entry.getKey() --> William A. Lathan
//            entry.getValue() --> 405-709-1865

        // findToKey(valueToFind,telephoneBook);
        System.out.println(findToKey(valueToFind, telephoneBook));


    }

    public static String findToKey(String valueToFind, HashMap<String, String> hashmap) {

        for (Map.Entry<String, String> entry : hashmap.entrySet()) {

            if (valueToFind.equals(entry.getValue())) {  // how to find a key if we know value
                return entry.getKey();
            }

//            entry.getKey() --> William A. Lathan
//            entry.getValue() --> 405-709-1865

        }
        return ""; // we should add it necessary in case Hashmap contain zero elements,
                   // otherwise the method well fail

    }
}
//    We are going to represent our contacts in a map where both the keys and values are strings.
//
//    Create a map with the following key-value pairs:
//
//    Name (key)	Phone number (value)
//    William A. Lathan	405-709-1865
//    John K. Miller	402-247-8568
//    Hortensia E. Foster	606-481-6467
//    Amanda D. Newland	319-243-5613
//    Brooke P. Askew	307-687-2982
//    Create an application which prints out the answers to the following questions:
//
//    What is John K. Miller's phone number?
//    Whose phone number is 307-687-2982? //
//    Do we know Chris E. Myers' phone number? (yes/no)
//    The full output of your main method should be the following:
//
//            402-247-8568
//    Brooke P. Askew
//            no

