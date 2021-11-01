package Homework;

import calc.Calculator;
import sun.font.FontRunIterator;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args)
            throws java.io.IOException {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        loop:
        for (int i = 0; i < i + 1; i++) {
            System.out.println("Please, input your first number");
            int a = scanner.nextInt();
            System.out.println("Please, input your second number");
            int b = scanner.nextInt();


            System.out.println("Please, input the operation: + - / *");
            String c = scanner.next();
            switch (c) {
                case "+":
                    System.out.println(calculator.gumarum(a, b));
                    break;
                case "-":
                    System.out.println(calculator.hanum(a, b));
                    break;
                case "/":
                    System.out.println(calculator.bajanum(a, b));
                    break;
                case "*":
                    System.out.println(calculator.bazmapatkum(a, b));
                    break;
                default:
                    System.out.println("Invalid input. Please, try again");
            }
            char choice;
            System.out.println("If you want to exit press # ");
            System.out.println("If you want to continue press !");
            choice = (char) System.in.read();

            System.out.println();

            switch (choice) {
                case '#':
                    System.out.println("Good Bye!!!");
                    break loop;
                case '!':
                    continue loop;
                default:
                    System.out.println("Please, press ! to continue, or # to finish");
            }
        }
    }
}