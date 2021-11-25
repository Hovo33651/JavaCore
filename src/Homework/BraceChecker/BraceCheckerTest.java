package Homework.BraceChecker;

import java.util.Scanner;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "hel{lo j)a(va";
        BraceChecker bc = new BraceChecker(text);
        bc.check1();
    }
}
