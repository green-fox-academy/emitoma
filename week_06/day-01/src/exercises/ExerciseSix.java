package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciseSix {
    public static void main(String[] args) {
//        Write a Stream Expression to find the uppercase characters in a string!
        String mysString = "AbCdE";
        String result = mysString
                .chars()
                .filter(Character::isUpperCase)
                .mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.joining());

        System.out.println(result);

    }
}
