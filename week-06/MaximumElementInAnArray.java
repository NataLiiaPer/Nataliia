public class MaximumElementInAnArray {
    public static void main(String[] args) {
        int[] numbers = {-1, -2, -300, -4500, -50, 60, -4};
        // int length = 6;
        int maxElement = findMax(numbers.length-1,numbers);
        System.out.println(maxElement);
    }

    public static int findMax(int idx, int[] array) {
         int maxElementInArray = array[0];
        // int i = 0;
        if (idx <0) {
            return 0;
        }
        if (maxElementInArray < array[idx]) {
            maxElementInArray = array[idx];

        }
        return findMax(idx-1,array)+maxElementInArray;
    }
}

// -1<array[6]-4
 //   0<



//public static void main(String[] args) {
//        int[] numbers = {-1, -2, -300, -4500, -50, -60, -4};
//        int max = numbers[0];
//        int min = numbers[0];
//        for (int i = 0; i < numbers.length; i++) {
//        System.out.println(numbers[i]);
//        if (max < numbers[i]) {
//        max = numbers[i];
//        }
//        if (min > numbers[i]) {
//        min = numbers[i];
//        }
//        }
//        System.out.println(max);
//        System.out.println(min);
//        }
//        }

//    Write a program to implement a recursive function
//    to find the maximum element in an array. (No loops allowed)

