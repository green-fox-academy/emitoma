package user_input;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void  main(String[] args){
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of your chickens:");
        int numOfChickens = scanner.nextInt();

        System.out.println("Enter the number of your pigs:");
        int numOfPigs = scanner.nextInt();

        int sumOfLegs = (numOfChickens * 2) + (numOfPigs * 4);

        System.out.println("Your animals have a total of: " + sumOfLegs + " legs.");



    }
}
