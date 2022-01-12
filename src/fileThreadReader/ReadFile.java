package fileThreadReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile implements Runnable {
    Thread t;
    String path;
    int startLine;
    int limit;
    String keyword;


    ReadFile(String path, int startLine, int limit, String keyword) {
        this.path = path;
        this.limit = limit;
        this.startLine = startLine;
        this.keyword = keyword;
        t = new Thread(this);
        t.start();

    }

    @Override
    public void run() {
        int count = 0;
        String line;
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            for (int i = startLine; i < limit; i++) {
                line = lines.get(i);
                if (line.contains(keyword)) {
                    count++;
                }
            }
            System.out.println("The word /" + keyword + "/ repeats " + count + " times");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}