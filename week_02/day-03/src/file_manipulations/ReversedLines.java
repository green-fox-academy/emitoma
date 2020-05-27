package file_manipulations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        //call the function!
        List<String> read = fileReader("reversed-lines.txt");
        reverser(read.toString());

    }

    public static StringBuilder reverser(String toReverse) {
        StringBuilder input = new StringBuilder();
        input.append(toReverse);

        input = input.reverse();
        System.out.println(input);// now this is a big ass string, and it's reversed, so it's readable but lines are still need to be reversed.
        return input;

    }

    public static List fileReader(String fileName) {
        List<String> lines = new ArrayList<>();

        try {
            Path filePath = Paths.get(fileName);
            lines = Files.readAllLines(filePath);


        } catch (IOException e) {
            System.out.println("Look like is doesn't work!");
        }
        return lines;
    }

}

/*public static StringBuilder reverse(String toReverse) {

        StringBuilder input = new StringBuilder();
        input.append(toReverse);

        input = input.reverse();
        return input;
        }*/