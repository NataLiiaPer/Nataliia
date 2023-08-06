public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        StringBuilder sb = new StringBuilder(todoText);
        sb.insert(0,"My todo:\n");
        sb.insert(21,"- Download games\n"+" " +" "+" "+" "+"" +
                "-Diablo");

        // Add "My todo:" to the beginning of the `todoText`
        // Add " - Download games" to the end of the `todoText`
        // Add " - Diablo" to the end of the `todoText` applying an extra 4 space indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        System.out.println(sb);
    }
}
