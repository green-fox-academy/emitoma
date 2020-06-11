package anagram;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
    /*Create a function named is anagram following your current language's style guide.
     It should take two strings and return a boolean value depending on whether its an anagram or not.*/
        System.out.println(isAnagram("dog", "cat"));
    }

    public static boolean isAnagram(String firstWord, String secondWord) {
        String w1 = firstWord.replaceAll("\\s", "");
        String w2 = secondWord.replaceAll("\\s", "");
        if (w1.length() != w2.length()) {
            return false;
        } else {
            char[] wordArr1 = w1.toLowerCase().toCharArray();
            char[] wordArr2 = w2.toLowerCase().toCharArray();
            Arrays.sort(wordArr1);
            Arrays.sort(wordArr2);
            if (Arrays.equals(wordArr1, wordArr2)) {
                return true;
            }
        }

        return false;
    }

}
