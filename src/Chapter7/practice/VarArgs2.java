package Chapter7.practice;

public class VarArgs2 {

    static void vaTest(String msg, int ... v){
        System.out.println(msg + v.length + " Content: ");

        for (int i : v)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        vaTest("One argument of variable length: ");
    }
}
