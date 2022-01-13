package fileThreadReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileThreadReader {

    public static void main(String[] args) {

        long l = System.currentTimeMillis();
        String path = "C:\\Hovo\\text.txt";

        int lineCount = 0;
        try {
            lineCount = (int) Files.lines(Paths.get(path)).count();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Text file has " + lineCount + " lines");
        System.out.println();


        ReadFile readFile = new ReadFile(path, 1, lineCount / 3, "pharetra");
        ReadFile readFile2 = new ReadFile(path, (lineCount / 3) + 1, 2 * (lineCount / 3), "pharetra");
        ReadFile readFile3 = new ReadFile(path, (2 * (lineCount / 3)) + 1, lineCount, "pharetra");


        try {
            readFile.t.join();
            readFile2.t.join();
            readFile3.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Process finished in " + (System.currentTimeMillis() - l) + " milliseconds");
    }
}





