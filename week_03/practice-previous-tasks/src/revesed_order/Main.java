package revesed_order;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            Path filePath = Paths.get("reversed-order.txt");
            Path newFile = Paths.get("new-reversed-order.txt");

            lines.addAll(Files.readAllLines(filePath));
            Collections.reverse(lines);
            Files.write(newFile, lines);

            System.out.println("done");
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
