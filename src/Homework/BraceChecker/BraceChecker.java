package Homework.BraceChecker;

public class BraceChecker {

    //սա հենց տեքստն է
    private String text;

    //կլասի կոնստրուկտերն է, որը պետք է ընդունի String տիպի տեքստ և վերագրիվերևի տեքստին
    //որ չկարողանանք breacjchecker-ի օբյեկտ սարքենք առանց text-
    // տալու կոնստրուկտորի միջոցով
    public BraceChecker(String text1) {
        text = text1;
    }

    //Սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան, աշխատելու ենք թե stack-ի
// հետ , թե վերևի text-ի
    public void check() {
        int index = -1;
        char c;
        Stack stack = new Stack();
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
                            System.err.println("Error: opened [ but closed ) in index " + index + " element");
                        }
                        if (pop == '{')
                            System.err.println("Error: opened { but closed ) in index " + index + " element");
                    case ']':
                        if (pop == '(') {
                            System.err.println("Error: opened ( but closed ] in index " + index + " element");
                        }
                        if (pop == '{') {
                            System.err.println("Error: opened { but closed ] in index " + index + " element");
                        }
                    case '}':
                        if (pop == '[') {
                            System.err.println("Error: opened [ but closed } in index " + index + " element");
                        }
                        if (pop == '(') {
                            System.err.println("Error: opened ( but closed } in index " + index + " element");
                        }
                }
            }
        }
    }
}