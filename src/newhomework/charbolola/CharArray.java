package newhomework.charbolola;

public class CharArray {
    public static void main(String[] args) {

        char[] bolola = {'f', 'o', 'b', 'o', 'a', 'b'};

        boolean bob = false;
        for (int i = 0; i < bolola.length-2; i++) {
            if(bolola[i] == 'b' && bolola[i+2] == 'b' ){
                bob = true;
            }
        }
        System.out.println(bob);

        //գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները
        System.out.println(bolola[bolola.length / 2 - 1] + "" + bolola[(bolola.length / 2)]);


        //տպել true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
        boolean ly = false;
        if (bolola[bolola.length - 1] == 'y' && bolola[bolola.length - 2] == 'l') {
            ly = true;
        }
        System.out.println(ly);


        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        int index = 0;
        for (int i = 0; i < text.length; i++) {
            char[] result = new char[text.length];
            if (text[i] != ' ') {
                result[i] = text[i];
                index++;
            } else continue;

            System.out.print(result[i]);
        }


    }
}

