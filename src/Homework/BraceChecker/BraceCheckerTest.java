package Homework.BraceChecker;

import java.util.Scanner;

public class BraceCheckerTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, write your text");
        String text = sc.next();
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }
}