import java.util.*;

public class Matchmaking {
    public static void main(String... args) {

        List<String> girls = new ArrayList<>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        List<String> boys = new ArrayList<>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));
        boys.size();
        boys.size();
        int i = 0;
        int j = 0;
    //    match(s = );
        if (girls.size() > boys.size()) {
            System.out.println("yes");
        } else {
            System.out.println("no");
            int dif = boys.size() - girls.size();
            System.out.println(dif);
//            for (i = 0; i < girls.size(); i++) {
//                for (j = 0; j < boys.size() - 1; j++) {
//                    if (j == i) {
//                        System.out.print(girls.get(i) + "-" + boys.get(j) + ",");
//                    }
//                }

                // Write a method that joins the two lists by matching one girl with one boy into a new list
                // If someone has no pair, he/she should be added to the list on his/her own
                // Expected output: [Eve-Joe, Ashley-Fred, Claire-Tom, Kat-Todd, Jane-Neef, Jeff]

                //  System.out.println(match(girls, boys));
            }
            //       System.out.print(girls.get(i)+"-"+boys.get(j)+","+boys.get(5));
//        public static void main() {
//
//        }
        }

//    public static void match(String s) {
//        for (int i = 0; i < girls.size(); i++) {
//            for (int j = 0; j < boys.size() - 1; j++) {
//                if (j == i) {
//                    System.out.print(girls.get(i) + "-" + boys.get(j) + ",");
//                }
//            }
//            //  System.out.print(boys.get(5));}
//        }


}
