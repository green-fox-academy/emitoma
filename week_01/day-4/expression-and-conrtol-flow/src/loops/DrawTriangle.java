package loops;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a number");
        int myNum = scanner.nextInt();

        for (int i = 0; i <= myNum; i++) {
            for (int j = 0; j <= myNum; j++) {
                if (j < i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}