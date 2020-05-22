package loops;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a number");

        double randomNum = (Math.random() * 100);

        int storedNum = (int) randomNum;

        System.out.println(randomNum);
        System.out.println(storedNum);

        boolean foundTheNumber = false;


        do {
            int userGuess = scanner.nextInt();
            if (userGuess == storedNum) {
                System.out.println("You found the number: " + storedNum);
                foundTheNumber = true;
            } else if (userGuess > storedNum) {
                System.out.println("The stored number is lower.");
            } else {
                System.out.println("The stored number is higher.");
            }

        } while (!foundTheNumber);

    }
}
