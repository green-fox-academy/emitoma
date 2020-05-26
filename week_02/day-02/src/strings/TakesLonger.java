package strings;

public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occurred. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)
        StringBuilder str = new StringBuilder();
        StringBuilder appendthis = str.append("It always takes longer than you");
        System.out.println(str);
        System.out.println(quote.indexOf("It"));
        System.out.println(quote.indexOf("you"));
        System.out.println(quote.replace("It you", appendthis));

//        quote.substring(18, 21).replace(" ", str);
//    (str.toString());
        System.out.println(quote);
    }
}
