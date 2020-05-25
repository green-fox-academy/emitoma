package func;

public class Factorial {
    public static void main(String[] args) {
        int num = 20;
        System.out.println(factorio(num));
        // - Create a function called `factorio`
        //   that returns it's input's factorial

    }

    public static long factorio(int input) {
        // 6! = 1*2*3*4*5*6
        long factor = (long) 1;
        for (int i = 1; i <= input; i++) {
            factor *= i;
        }
        return  factor;
    }
}
