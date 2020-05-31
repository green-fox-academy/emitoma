package func;

import java.util.*;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
//        System.out.println(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
        int[] myArr = {1, 11, 34, 11, 52, 61, 1, 34};
        System.out.println(Arrays.toString(unique(myArr).toArray()));

    }

    public static TreeSet<Integer> unique(int[] arr) {
        TreeSet<Integer> unique = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {
            unique.add(arr[i]);
        }

        return unique;
    }
}
