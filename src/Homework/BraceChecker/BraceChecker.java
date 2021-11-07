package Homework.BraceChecker;


import javafx.scene.effect.BlendBuilder;

import java.util.*;

public class BraceChecker {
    //սա հենց տեքստն է
    private String text;
    char c;
    int index = -1;

    //կլասի կոնստրուկտերն է, որը պետք է ընդունի String տիպի տեքստ և վերագրիվերևի տեքստին
    //որ չկարողանանք breacjchecker-ի օբյեկտ սարքենք առանց text-
    // տալու կոնստրուկտորի միջոցով
    public BraceChecker(String i) {
        text = i;
    }

    //Սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան, աշխատելու ենք թե stack-ի
// հետ , թե վերևի text-ի
    public void check() {
        Stack stack = new Stack();
        char[] chars = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            c = text.charAt(i);
            ++index;
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                char pop = stack.pop();
                switch (c) {
                    case ')':
                        if (pop == '[') {
                            System.err.println("Error: opened [ but closed ) in index " + (index) + " element");
                        }
                        if (pop == '{')
                            System.err.println("Error: opened { but closed ) in index " + (index) + " element");
                    case ']':
                        if (pop == '(') {
                            System.err.println("Error: opened ( but closed ] in index " + (index) + " element");
                        }
                        if (pop == '{') {
                            System.err.println("Error: opened { but closed ] in index " + (index) + " element");
                        }
                    case '}':
                        if (pop == '[') {
                            System.err.println("Error: opened [ but closed } in index " + (index) + " element");
                        }
                        if (pop == '(') {
                            System.err.println("Error: opened ( but closed } in index " + (index) + " element");
                        }
                }
            }
        }
    }

}