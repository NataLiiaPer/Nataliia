import java.util.Arrays;

public class SumElementsInArray {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 3};
        int sum = FindSum(numbers);
        System.out.println(sum);
    }

    public static int FindSum(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int firstElement = arr[0];
        int[] newArr = Arrays.copyOfRange(arr, 1, arr.length);
        int sum = FindSum(newArr) + firstElement;
        return sum;
    }
}


//    Write a recursive function to find the sum of all elements in an integer array. (*)