package Homework.arrayutil;

public class CharBabola {
    public static void main(String[] args) {

        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';

        // Քանի 'o' ունի bolola մասսիվը

        System.out.print("bolola has ");
        int o = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c)
                o++;
        }
        System.out.println(o + " char 'o' ");


        // Տպել մեջտեղի lo-ն

        for (int i = 0; i < bolola.length; i++) {
            if (i == bolola.length / 2) {
                System.out.println(bolola[i - 1] + " " + bolola[i]);
            }
        }

        //Տպել true եթե մասսիվի մեջ կա b simbole b, եթե չկա, տպել false
        char[] bolola1 = {'a', 'l', 'a', 'c', 'o', 'b', 'a'};

        for (int i = 0; i < bolola1.length; i++) {
            if (bolola1[i] != 'b')
                continue;
            if (bolola1[i] == 'b' && bolola1[i + 2] == 'b') {
                System.out.println("true");
                break;
            } else System.out.println("false");
        }

        // Եթե մասսիվը վերջանում է ly-ով, տպել true, եթե ոչ՝ տպել false
        if (bolola[bolola.length - 2] == 'l' && bolola[bolola.length - 1] == 'y') {
            System.out.println("true");
        } else System.out.println("false");



        // Սարքել նոր մասսիվ, որը պարունակի մենակ barev-ը
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};

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






        











