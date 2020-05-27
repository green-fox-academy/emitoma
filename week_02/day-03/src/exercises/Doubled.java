package exercises;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
            }
    public static List fileReader(String fileName) {
        //Reads the file
        List<String> lines = new ArrayList<>();
        try {
            Path filePath = Paths.get(fileName);
            lines = Files.readAllLines(filePath);

        } catch (IOException e) {
            System.exit(0);
        }
        return lines;
    }
}