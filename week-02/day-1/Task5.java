public class Task5 {
    /*
    create a for cycle to read all elements of the array, print them and find the biggest number, store it in the variable
    and print it. Dont change the order of the array :)
     */
    public static void main(String[] args) {
        int[] numbers = {-1, -2, -300, -4500, -50, -60, -4};
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}
