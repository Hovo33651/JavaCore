package Homework;

import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {

        int[] p = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i] % 2 == 0) {
                evenSum += p[i];
            } else {
                oddSum += p[i];
            }
        }
        int a = 15 % 3;
        System.out.println(a);
    }
}