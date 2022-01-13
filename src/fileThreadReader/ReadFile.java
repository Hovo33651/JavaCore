package fileThreadReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile implements Runnable {
    Thread t;
    String path;
    int startLine;
    int limitLine;
    String keyword;


    ReadFile(String path, int startLine, int limitLine, String keyword) {
        this.path = path;
        this.limitLine = limitLine;
        this.startLine = startLine;
        this.keyword = keyword;
        t = new Thread(this);
            t.start();
    }




    @Override
    public void run() {
        long l = System.currentTimeMillis();
        int count = 0;
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            for (int i = startLine; i < limitLine; i++) {
                if (lines.get(i).contains(keyword)) {
                    count++;
                }
            }
            System.out.print("From line <" + startLine + "> to line <" + limitLine + "> ");
            System.out.println("the word <<" + keyword + ">> repeats " + count + " times");
            System.out.println("This thread finished in " + (System.currentTimeMillis() - l) + " milliseconds");
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}