package Homework;

import calc.Calculator;
import sun.font.FontRunIterator;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args)
            throws java.io.IOException {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
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
                    System.out.println("Invalid input");
            }
            loop1:
            for (int j = 0; j < j + 1; j++) {
                char choice;
                    System.out.println("Press # to finish ");
                    System.out.println("Press any key to start again");
                    choice = (char) System.in.read();

                    System.out.println();

                    if (choice == '#') {
                        System.out.println("Good Bye!!!");
                        return;
                    }else{
                            break loop1;
                    }
                }
            }
        }
    }