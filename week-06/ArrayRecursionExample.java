public class ArrayRecursionExample {

    public static int sumArray(int[] arr, int index) {
        if (index < 0) {
            return 0; // Базовый случай: сумма пустого массива равна 0
        } else {
            // Рекурсивный случай: суммируем текущий элемент и рекурсивно вызываем функцию для оставшейся части массива
            return arr[index] + sumArray(arr, index - 1);
            // arr[0]+0 1+0
            // arr[1]+0 2+1
            // arr[2]+0 3+3
            // arr[3]+0 4+6
            // arr[4]+0 5+10


        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = sumArray(array, array.length - 1);
        System.out.println("Сумма элементов массива: " + sum);
    }
}
