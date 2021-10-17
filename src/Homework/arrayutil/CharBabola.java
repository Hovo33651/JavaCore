package Homework.arrayutil;

public class CharBabola {
    public static void main(String[] args) {

        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';

        System.out.print("bolola has ");
        int o = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c)
                o++;
        }
        System.out.println(o + " char 'o' ");







        for (int i = 0; i < bolola.length; i++) {
            if (i == bolola.length / 2) {
                System.out.println(bolola[i - 1] + " " + bolola[i]);
            }
        }







        char[] bolola1 = {'a','b', 'a', 'b', 'o', 'l', 'a'};

        for (int i = 0; i < bolola1.length; i++) {
            if (bolola1[i] == 'b') {
                if (bolola1[i] == bolola1[i + 2]) {
                    System.out.println("true");
                }
                break;
            } else System.out.println("false");
        }






        if (bolola[bolola.length - 2] == 'l' && bolola[bolola.length - 1] == 'y') {
            System.out.println("true");
        } else System.out.println("false");


        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};

        int index = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i] == ' ') {
                index++;
            }
        }

        char[] barev = new char[text.length - index];

        int a = 0;

        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                barev[a] = text[i];
                a++;
            }
        }

        for (int i = 0; i < barev.length; i++) {
            System.out.print(barev[i]);
        }


    }


}






        











