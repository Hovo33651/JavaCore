package fileThreadReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileThreadReader {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Hovo\\text.txt";
        int lineCount = (int) Files.lines(Paths.get(path)).count();

        ReadFile readFile = new ReadFile(path, 1, lineCount / 2, "nulla");
        ReadFile readFile2 = new ReadFile(path, lineCount / 2, lineCount, "nulla");

    }
}





