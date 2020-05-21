package variables;

public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make the "a" variable's value bigger by 10

        a += 10;

        System.out.println(a);


        int b = 100;
        // make b smaller by 7
        b -= 7;

        System.out.println(b);

        int c = 44;
        // please double c's value
        c *= 2;

        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d /= 5;

        System.out.println(d);

        int e = 8;
        // please cube of e's value
        int e2 = e * e * e;

        System.out.println(e2);

        int f1 = 123;
        int f2 = 345;
        boolean ff = (f1 > f2);
        System.out.println(ff);
        // tell if f1 is bigger than f2 (print as a boolean)

        int g1 = 350;
        int g2 = 200;

        boolean gg = (g2 *= 2 ) > g1;
        System.out.println(gg);
        // tell if the double of g2 is bigger than g1 (print as a boolean)

        int h = 135798745;
        h %= 11;
        boolean hh = (h == 0);
        System.out.println(hh);

        // tell if it has 11 as a divisor (print as a boolean)

        int i1 = 10;
        int i2 = 3;
        boolean ii = (i1 > (i2 *= 2)) && (i1 < (i2 * i2 * i2)); //10 > 9 && 10 <  27 -> ture
        System.out.println(ii);
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        int j = 1521;
        int j1 = j %= 3; //0
        int j2 = j %= 5; //1
        boolean jj = (j1 == 0) || (j2 == 0); //true
        System.out.println(jj);
        // tell if j is dividable by 3 or 5 (print as a boolean)
    }
}
