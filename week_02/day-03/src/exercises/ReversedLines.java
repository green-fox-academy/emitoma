package exercises;

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
        List<String> readFile = fileReader("reversed-lines.txt");
        reverser(readFile);
    }

    public static String reverser(List<String> toReverse) {
            //reverse content
        String reversedLine = "";
            //input.append(toReverse);
        for (int i = 0; i < toReverse.size(); i++) {

            String line = toReverse.get(i);
            StringBuilder input = new StringBuilder(line);
            reversedLine = input.reverse().toString();
            System.out.println(reversedLine);
        }
        return reversedLine;
    }

    public static List fileReader(String fileName) {
        //read the file
        List<String> lines = new ArrayList<>();

        try {
            Path filePath = Paths.get(fileName);
            lines = Files.readAllLines(filePath);

        } catch (IOException e) {
            System.out.println("Looks like is doesn't work!");
        }
        return lines;
    }

}
