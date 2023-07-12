public class PassingArgByValue {
        public static void main(String[] args) {
            int x = 5;
            System.out.println("Значение x до вызова метода: " + x);
            changeValue(x);
            System.out.println("Значение x после вызова метода: " + x);
        }

        public static void changeValue(int value) {
            value = 10;
            System.out.println("Значение value внутри метода: " + value);
        }
    }


