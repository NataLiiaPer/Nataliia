import java.util.Arrays;

public class MinElementInArray {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 0};
        int firstElement = numbers[0];
        int minElement = findMin(firstElement, numbers);
        System.out.println(minElement);


    }

    private static int findMin(int min, int[] arr) {
        if (arr.length == 1) { // base case - in Array have to be at least one element!!!
            return min;
        }
        int[] newArr = Arrays.copyOfRange(arr, 1, arr.length);
        if (min > arr[1]) {
            min = arr[1];
        }
           return findMin(min,newArr);
    }
}


//    Write a program to implement a recursive
//    function to find the minimum element in an array. (No loops allowed) (*)