package file_manipulations;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {

        writer("my-file.txt","catto", 8);
        writer("my-file2.txt", "Doggo", 5);

    }

    public static void writer(String fileName, String myWord, int myNum) {
        List<String> content = new ArrayList<>();
        try {
            Path filePath = Paths.get(fileName);

            for (int i = 1; i <= myNum; i++) {
                content.add(myWord);
            }
            Files.write(filePath, content);
//            System.out.println("done");

        } catch (IOException e) {
//            System.out.println("didn't worked");
            System.exit(0);
        }

    }

}
