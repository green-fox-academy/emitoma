package user_input;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class AverageOfInput {
    public static void  main(String[] args){
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write 5 separate integers please!");
        int sum = 0;
        for(int i = 0; i <5; i++){
            int num = scanner.nextInt();
            sum += num;
        }

        int average = sum / 5;

        System.out.println("Sum: " + sum + " Average:" + average);

    }
}
