package hard_ones;

import java.util.Scanner;

public class FindTheSubString {
    public  static void    main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write string:");
        String userInput = scanner.nextLine();
        System.out.println("write a word to search for:");
        String searchthis = scanner.nextLine();
        subStr(userInput, searchthis);

    }
    public static int subStr(String input, String q) {
        System.out.println(input.indexOf(q));
        return -1;
    }
}
