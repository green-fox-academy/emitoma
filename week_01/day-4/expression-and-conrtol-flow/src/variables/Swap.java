package variables;

public class Swap {
    public static void main (String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;
        System.out.println(a);
        System.out.println(b);

        a = a + b; //123+526 = 649
        b = a - b; // 649 - 526 =123
        a = a - b; // 649 - 123 = 526



        System.out.println(a);
        System.out.println(b);
    }
}