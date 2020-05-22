package loops;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args){
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write 2 numbers");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();


        if (num2 > num1) {
            for (int i = num1; i <= num2; i++){
            System.out.println(i);
             } ;
        } else{
            System.out.println("The second number should be bigger");
            //if  a num1 is bigger then ask for a bigger num for the second and do it until user gives the correct num, and run the for loop
//            int newNum1 = scanner.nextInt();
//            int newMum2 = scanner.nextInt();
        }
    }
}

