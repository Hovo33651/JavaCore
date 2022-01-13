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

    public static void main(String[] args) throws IOException, InterruptedException { //137088    1274

        String path = "C:\\Hovo\\text.txt";
        String keyword = "pharetra";
        int count = (int) Files.lines(Paths.get(path)).count();

        System.out.println("all lines:" + count);
        long currentTime = System.currentTimeMillis();


        List<String> strings = Files.readAllLines(Paths.get(path));
        List<String> strings1 = strings.subList(1, count/4);
        List<String> strings2 = strings.subList((count/4)+1, 2*(count/4));
        List<String> strings3 = strings.subList((2*(count/4))+1, 3*(count/4));
        List<String> strings4 = strings.subList((3*(count/4))+1, count);


        new SingleRead(keyword, strings1).t.join();
        new SingleRead(keyword, strings2).t.join();
        new SingleRead(keyword, strings3).t.join();
        new SingleRead(keyword, strings4).t.join();



        System.out.println("found lines :" + countOfKeyword);
        long finishTime = System.currentTimeMillis();
        System.out.println("time: " + (finishTime - currentTime));


    }
}