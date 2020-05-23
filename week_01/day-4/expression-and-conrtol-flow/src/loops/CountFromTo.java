package loops;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write 2 numbers");

        boolean secondBigger = false;


        do {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            if (num2 > num1) {
                for (int i = num1; i <= num2; i++) {
                    System.out.println(i);
                    secondBigger = true;
                }
                ;
            } else {
                System.out.println("The second number should be bigger");
            }
        } while (!secondBigger);


    }
}


