//import java.util.Scanner;
//
//public class SubInt {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int digit = scanner.nextInt();
//        int[]array = new int[5];
//       // int[] array1 = {1, 11, 34, 52, 61};
////        int [] awesomeArray = giveMeArrayFromInts(3,7,1);
////        System.out.println(awesomeArray[0]);
//        System.out.println(array.toString(findMatchingIndexes(digit , new int[]{1, 11, 34, 52, 61})));
//    }
//
//    public static void findMatchingIndexes(int digit, int[] array) {
//        int[]array = new int[4];
//        array [0] = 1;
//        array [1] = 11;
//        array [2] = 34;
//        array [3] = 52;
//        array [4] = 61;
//        for (int i = 0; i < array.length; i++) {
//            if (i == digit) {
//                System.out.println(array[i]);
//            }
//            else {
//                System.out.println(array[Integer.parseInt(null)]);
//            }
//        }
//    }
//}


//  Arrays.toString(findMatchingIndexes(1, new int[] { 1, 11, 34, 52, 61 })
// Create a function that takes a number (a digit) and an array of integers
// as parameters and returns the indices of the integers in the array
// which contain the given digit or returns an empty array
// (if no number in the array contains the given digit)

// Examples:
//   System.out.println(Arrays.toString(findMatchingIndexes(1, new int[]{1, 11, 34, 52, 61})));
// should print: `[0, 1, 4]`
//  System.out.println(Arrays.toString(findMatchingIndexes(9, new int[]{1, 11, 34, 52, 61})));
// should print: '[]'

// Note: We are using Arrays.toString() function to print the returned array
// You could just as well iterate over the array and print its items one by one

