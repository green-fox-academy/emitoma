package strings;

public class Reverse {
    public static void main(String[] args) {

        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";


        System.out.println(reverse(toBeReversed));
    }

    // Create a method that can reverse a String, which is passed as the parameter
    // Use it on this reversed string to check it!


    public static StringBuilder reverse(String toReverse) {

        StringBuilder input = new StringBuilder();
        input.append(toReverse);

        input = input.reverse();
        return input;

        // Try to solve this using charAt() first, and optionally anything else after. -> I
        // tried this, Nope.

//
//        int lastChar = toReverse.length() - 1;
//        System.out.println(lastChar);
//
//        for (int i = 0; i < toReverse.length() / 2; i++) {
//            int temp = toReverse.charAt(i);
//            toReverse.charAt(i) = toReverse.charAt(lastChar - i);
//
//
//        }


    }
}



