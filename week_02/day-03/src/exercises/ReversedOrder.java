package exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {

        // Create a method that decrypts reversed-order.txt
        //call the function!
        String fileName = "reversed-order.txt";
        System.out.println(fileReader(fileName));

    }

//    public static List<String> reverser(List<String> filename) {
//
//
//    }

    public static List fileReader(String fileName) {
        //read the file
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

