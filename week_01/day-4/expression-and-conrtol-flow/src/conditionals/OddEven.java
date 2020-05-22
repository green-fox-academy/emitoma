package conditionals;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
    // Write a program that reads a number from the standard input,
    // Then prints "Odd" if the number is odd, or "Even" if it is even.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add a number!");

        int myNum = scanner.nextInt();
        int checkNum = myNum % 2 ;
        System.out.println(checkNum);

        if (checkNum == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
