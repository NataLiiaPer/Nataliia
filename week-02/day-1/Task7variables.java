public class Task7variables {
        public static void main (String[]args) {
    //write code so that a will contain value of b, b of c, c of a.
                int a  = 6;
                int b  = 10;
                int c  = 5;
                int aNew = 0;
                aNew = a; //aNew == 6
                a = b; //a == 10
                b = c; // b == 5
                c = aNew; // c == 6
                System.out.println("a = "+a + "; b = "+ b+ "; c = "+c);


}
}
