package Chapter7.practice;

public class VarArgs3 {

    static void vaTest(int... v) {
        System.out.print("vaTest (int ...): " +
                " Number of arguments: " + v.length + " Content: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest (boolean ...): " +
                " Number of arguments: " + v.length + " Content: ");

        for (boolean b : v)
            System.out.print(b + " ");
        System.out.println();
    }

    static void vaTest(String msg, int... v) {
        System.out.print("vaTest (String msg, int ...): " +
                " Number of arguments: " + v.length + " Content: ");

        for (int b : v)
            System.out.print(msg + " " + b + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        vaTest(1, 2, 3);
        vaTest("Check ", 10, 20);
        vaTest(true, false, true);
    }
}
