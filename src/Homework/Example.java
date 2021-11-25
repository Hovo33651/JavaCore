package Homework;

import Chapter5.Switch;
import calc.Calculator;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        input1:
        for (int j = 0; j < j + 1; j++) {
            System.out.println("please input first number");
            int a = scanner.nextInt();
            System.out.println("please input second number");
            int b = scanner.nextInt();

            input2:
            for (int i = 0; i < i + 1; i++) {
                System.out.println("please input the operation");
                String c = scanner.next();
                switch (c) {
                    case "+":
                        System.out.print("the result is: ");
                        System.out.println(calc.gumarum(a, b));
                        System.out.println();
                        break;
                    case "-":
                        System.out.print("the result is: ");
                        System.out.println(calc.hanum(a, b));
                        System.out.println();
                        break;
                    default:
                        System.out.println("invalid input. Operations are + and - ,");
                        continue input2;
                }

                String choice;
                for (int k = 0; k < k + 3; k++) {
                    System.out.println("to finish press #");
                    System.out.println("to continue press !");
                    choice = scanner.next();
                    if (choice.equals("#")) {
                        System.out.println("good bye");
                        return;
                    } else if (choice.equals("!")) {
                        System.out.println("let's do it again");
                        continue input1;
                    }
                }
            }
        }
    }
}