package Homework.arrayutil;

public class ArrayBob {
    public static void main(String[] args) {

        char[] bolola1 = {'a', 'l', 'a', 'c', 'o', 'b', 'a'};

        boolean found = false;
        for (int i = 0; i < bolola1.length; i++) {
            if (bolola1[i] != 'b')
                continue;
            if (bolola1[i] == 'b' && i == bolola1.length-2)
                break;
            if (bolola1[i] == 'b' && bolola1[i+2] == 'b')
                found = true;
        }
        System.out.println(found);

    }
}
