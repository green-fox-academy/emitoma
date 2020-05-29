package loops;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

//         Write a program that stores a number, and the user has to figure it out.
//         The user can input guesses, after each guess the program would tell one
//         of the following:
//
//         The stored number is higher
//         The stried number is lower
//         You found the number: 8

        // Make a scanner to read the user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a number between 0 and 25");

        //Make a random number

//      int storedNum = (int) (Math.random() * 10);
        Random random = new Random();
        int storedNum = random.nextInt(25);


        //Switch for the game, is false the game goes on, if true the game ends.
        boolean foundTheNumber = false;

        do {
            // Read the user input
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
