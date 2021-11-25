package newhomework;

import Chapter5.Switch;

public class TextTest {
    public static void main(String[] args) {

        String text = "hello (world) java";
        int tos = -1;
        int index = -1;

        char[] text2 = new char[text.length()];
        char[] text1 = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != '(')
                text1[++tos] = c;
            System.out.println(text1);
        }
    }
}