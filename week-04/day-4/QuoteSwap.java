import java.util.*;

public class QuoteSwap {
    public static void main(String... args) {

        List<String> list = Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand.");

               swapQuote(list);
    }

    public static void swapQuote(List<String> list) {
        List<String> list1 = Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand.");
        String s1 = "do";
        String s2 = "cannot";
        list1.set(5, s1);
        list1.set(2, s2);
        for (int i = 0; i < list1.size(); i++) {
            list1.get(i);
            System.out.print(list1.get(i)+" ");
        }
    }
}
// Accidentally I messed up this quote from Richard Feynman
// Two words are out of place
// Your task is to fix it by swapping the right words with code
// To do this: create a method called "swapQuote()"
// it should return a sentence formed from the words separated by a single space

// Expected output: "What I cannot create, I do not understand."