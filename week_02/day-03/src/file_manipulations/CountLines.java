package file_manipulations;

import javax.sound.sampled.Line;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class CountLines {
    public static void main(String[] args) {
        lineCounter("/my-file.txt");

    }

    public static void lineCounter(String fileName) {
        List<String> lines = new ArrayList<>();
        try {
            Path filePath = Paths.get(fileName);
            lines = Files.readAllLines(filePath);


            System.out.println(lines.size());
//            for (String line : lines) {
//                System.out.println(line); //should print 5
//            }
        } catch (Exception e) {
            System.exit(0);
        }

    }
    // Write a function that takes a filename as string, - OK

    // then returns the number of lines the file contains.

    // It should return zero if it can't open the file, and -OK
    // should not raise any error.
}
