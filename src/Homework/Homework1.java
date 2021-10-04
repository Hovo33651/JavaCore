package Homework;

public class Homework1 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print('*');
            }
            System.out.println('*');

            /* ցիկլ1 i=1, j=0, 0<1-1 2-րդ ցիկլը false, անցավ առաջին ցիկլի կատարմանը
               ցիկլ2 i=2, j=0(նորից 0, որովհետև առաջին անգամ սխալ էր, նորից է սկսում), 0<2-1,  2-րդ ցիկլը true,
               կատարվեց, վերադարձավ իր(2-րդ) ցիկլի հաջորդ պայմանը ստուգելու, j=1, 1<2-1, 2-րդ ցիկլը false,
                անցավ առաջին ցիկլի կատարմանը:
                Եվ այդպես մինչև առաջին ցիկլի false-ը
                */

        }
    }
}






