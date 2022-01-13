package fileThreadReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class SingleRead implements Runnable {
    public static AtomicInteger countOfKeyword = new AtomicInteger();
    String keyword;
    Thread t;
    List<String> strings;


    SingleRead(String keyword, List<String> strings) {
        this.strings = strings;
        this.keyword = keyword;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        for (String subString : strings) {
            if (subString.contains(keyword))
                countOfKeyword.incrementAndGet();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        String path = "C:\\Hovo\\text.txt";
        int count = (int) Files.lines(Paths.get(path)).count();

        System.out.println("all lines:" + count);
        long currentTime = System.currentTimeMillis();
        String keyword = ",";
        List<String> strings = Files.readAllLines(Paths.get(path));
        List<String> strings1 = strings.subList(1, 150000);
        List<String> strings2 = strings.subList(150001, 300000);
        List<String> strings3 = strings.subList(300001, 450000);
        List<String> strings4 = strings.subList(400001, count);

        new SingleRead(keyword, strings1).t.join();
        new SingleRead(keyword, strings2).t.join();
        new SingleRead(keyword, strings3).t.join();
        new SingleRead(keyword, strings4).t.join();



        System.out.println("found lines :" + countOfKeyword);
        long finishTime = System.currentTimeMillis();
        System.out.println("time: " + (finishTime - currentTime));


    }
}