import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(anagramFinder("potter", "topter"));
    }

    public static boolean anagramFinder(String str1, String str2) {
        if (str1.length() == str2.length()) {
            char[] temp1 = str1.toCharArray();
            char[] temp2 = str2.toCharArray();
            Arrays.sort(temp1);
            Arrays.sort(temp2);
            if (Arrays.equals(temp1, temp2)) {
                
                return true;
            }
        }
        return false;
    }
}
