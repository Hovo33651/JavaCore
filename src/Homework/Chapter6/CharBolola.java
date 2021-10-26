package Homework.Chapter6;

public class CharBolola {

    char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a', 'b', 'f'};
    char[] bolola1 = {'a', 'l', 'a', 'c', 'o', 'c', 'a'};
    char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};

    void count() {
        System.out.print("bolola has ");
        int o = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == 'o')
                o++;
        }
        System.out.println(o + " char 'o' ");
    }

    void lo() {
        for (int i = 0; i < bolola.length; i++) {
            if (i == bolola.length / 2) {
                System.out.println(bolola[i - 2] + " " + bolola[i - 1]);
            }
        }
    }

    void bob() {
        boolean found = false;
        for (int i = 0; i < bolola1.length; i++) {
            if (bolola1[i] != 'b')
                continue;
            if (bolola1[i] == 'b' && i == bolola1.length - 2)
                break;
            if (bolola1[i] == 'b' && bolola1[i + 2] == 'b')
                found = true;
        }
        System.out.println(found);
    }

    void ifFalse(){
        if (bolola[bolola.length - 2] == 'l' && bolola[bolola.length - 1] == 'y') {
            System.out.println("true");
        } else System.out.println("false");
    }

    void barev(){
        int index = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i] == ' ') {
                index++;
            }
        }
        char[] result = new char[text.length - index];

        int a = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                result[a] = text[i];
                a++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}
