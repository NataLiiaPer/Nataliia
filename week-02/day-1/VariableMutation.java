public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // increase the value of variable "a" by 10
            a +=10;
        System.out.println(a);

        int b = 100;
        b-=7;
        // decrease the value of b by 7

        System.out.println(b);

        int c = 44;
        c*=c;
        // double the value of c

        System.out.println(c);

        int d = 125;
        d/=5;
        // divide the value of d by 5

        System.out.println(d);

        int e = 8;
        e=e*e*e;
        // cube the value of e

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean greater = f1>f2;
        System.out.println(greater);
        // determine if f1 is greater than f2 (print as a boolean)

        int g1 = 350;
        int g2 = 200;
        boolean ifGreater = g2*g2>g1;
        System.out.println(ifGreater);
        // determine if double the value of g2 is greater
        // than g1 (print as a boolean)

        int h = 135798745;
        boolean devisor = h%11==0;
        System.out.println(devisor);
        // determine if h has 11 as a divisor (print as a boolean)

        int i1 = 10;
        int i2 = 3;
        boolean new1 = i1>i2*i2&&i2<i2*i2*i2;
        System.out.println(new1);
        // determine if i1 is greater than i2 squared and smaller than i2 cubed
        // (print as a boolean)

        int j = 1521;
        
        // determine if j is divisible by 3 or 5 (print as a boolean)
    }
}

