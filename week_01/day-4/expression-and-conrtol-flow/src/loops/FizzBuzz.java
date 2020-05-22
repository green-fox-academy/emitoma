package loops;

public class FizzBuzz {
    public static void main(String[] args) {


        byte i = 0;
        while (i < 100) {
            i++;

            byte a = (byte) (i % 3);
            byte b = (byte) (i % 5);


            if ((a == 0) && (b == 0)) {
                System.out.println("FizzBuzz");
            } else if (a == 0) {
                System.out.println("Fizz");
            } else if (b == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print “Fizz” instead of the number
        // and for the multiples of five print “Buzz”.
        // For numbers which are multiples of both three and five print “FizzBuzz”.
    }
}
