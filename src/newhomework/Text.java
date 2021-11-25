package newhomework;

public class Text {
    public static void main(String[] args) {

        String text = "hello (world) java";
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(index++);
            if (c != '(' && c != ')') {
                System.out.print(c);


            }
        }
    }

}

