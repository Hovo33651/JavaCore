package Homework.arrayutil;

public class Hoo {
    public static void main(String[] args) {

        char[] bolola1 = {'a', 'l', 'a', 'b', 'o', 'b', 'a'};

        for (int i = 0; i < bolola1.length; i++) {
            if (bolola1[i] != 'b')
                continue;
            if(bolola1[i] == 'b' && bolola1[i + 2] == 'b'){
                System.out.println("true");
                break;
            }else System.out.println("false");
        }
    }
}