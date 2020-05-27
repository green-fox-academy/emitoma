package file_manipulations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        copier("my-file4.txt", "my-file2.txt");
    }

    public static void copier(String fileNameCopyFrom, String fileNameCopyTo) {
        boolean copySuccessful;
        try {
            // 1.part : Write the part where the function read the file we want to copy
            List<String> copy = fileReader(fileNameCopyFrom);
            System.out.println(copy);// the list of lines in the original file


            //2. part: Write the part which writes the new file
            fileWriter(fileNameCopyTo, copy);

           copySuccessful = true;
            System.out.println(copySuccessful);
        } catch (Exception e) {

            copySuccessful = false;
            System.out.println(copySuccessful);
        }
    }


    public static List fileReader(String fileName) {
        //Reads the file
        List<String> lines = new ArrayList<>();
        try {
            Path filePath = Paths.get(fileName);
            lines = Files.readAllLines(filePath);

        } catch (Exception e) {
            System.exit(0);
        }
        return lines;
    }


    public static void fileWriter(String fileName, List<String> copiedContent) {
        //Writes the file
        List<String> content = new ArrayList<>(copiedContent);
        try {
            Path filePath = Paths.get(fileName);


            Files.write(filePath, content);
            System.out.println("done");

        } catch (IOException e) {
            System.exit(0);
        }

    }
}
