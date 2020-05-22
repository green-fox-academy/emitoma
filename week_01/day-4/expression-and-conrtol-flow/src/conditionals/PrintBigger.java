package conditionals;

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args){
        // Write a program that asks for two numbers and prints the bigger one
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please add two numbers!");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
