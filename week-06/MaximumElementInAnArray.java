public class MaximumElementInAnArray {
    public static void main(String[] args) {
        int[] numbers = {-1, 2, -300};
        // int length = 6;
        int max = numbers[0];
        int maxElement = findMax(max,numbers);
        System.out.println(maxElement);

    }

    public static int findMax(int maxElementInArray, int[] array) {

        if (array.length ==1) { // base case - in Array have to be at least one element!!!
            return maxElementInArray;
        }


        int[] newArray = Arrays.copyOfRange(array, 1, array.length); //create new
        // Array with new length


//        int[] newArray = new int[array.length - 1];
//        for (int i = 0; i < newArray.length; i++) { //copy an array - only this way!!!
//            newArray[i]  = array[i];
//        }
        if (maxElementInArray < array[1]) { //
            maxElementInArray = array[1];

        }
        return findMax(maxElementInArray,newArray);
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

