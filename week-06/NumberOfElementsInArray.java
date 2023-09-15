import java.util.Arrays;

public class NumberOfElementsInArray {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 1, 1, 15, 1};
        int thisEl = 1;
//        int counter = 0;
//        counter= TheMountOfEl(numbers, thisEl, counter);
        System.out.println(Arrays.toString(TheMountOfEl(numbers, thisEl)));
    }

    public static int[] TheMountOfEl(int[] arr, int el) {

        if (arr.length == 1||arr[0]==el) {
            return arr;
        }

        int[] newArr = Arrays.copyOfRange(arr, 1, arr.length);
       // counter++;
  //    System.out.println("counter " + counter);
        if (el == arr[0]) {
            return newArr;
        }
        return TheMountOfEl(newArr, el);
    }
}


//    Create a recursive function to count the number of times a specific element
//    appears in an array. (*)