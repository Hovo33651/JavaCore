package Homework.arrayutil;

public class ArrayHelloJava {
    public static void main(String[] args) {

        char[] text = {' ', ' ', ' ', 'h', 'e', 'l', 'l', 'o', ' ', ' ',
                'j', 'a', 'v', 'a', ' ', ' '};

        // Գրել կոդ, որը կջնջի միայն սկզբի ու վերջի պռոբելները
        int index = 0;
        int i = 0;
        char[] result = new char[text.length];
        for (i = 0; i < text.length; i++) {
            if (text[i] == ' ')
                continue;
            else if (text[i] != ' ') {
                index++;
                result[index] = text[i];
                break;
            }
        }
        for (int j = i; j < text.length; j++) {
            if (text[j] == ' ') {
                index++;
                result[index] = text[j];
            } else if (text[j] != ' ') {
                index++;
                result[index] = text[j];
            }
            System.out.print(result[index]);
        }

    }
}





