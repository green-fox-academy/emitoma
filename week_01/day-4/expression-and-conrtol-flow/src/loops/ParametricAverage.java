package loops;

import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number:");
        int sum = 0;
        int numOfInputs = scanner.nextInt();
        System.out.println("Write " + numOfInputs + " separate numbers!");
        for (int i = 0; i < numOfInputs; i++) {
            int num = scanner.nextInt();
            sum += num;
        }

        int average = sum / numOfInputs;

        System.out.println("Sum: " + sum + " Average:" + average);

    }
}
