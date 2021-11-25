package Chapter7;

public class Overload {

    public static void main(String[] args) {

        OverloadDemo ob = new OverloadDemo();
        double result;
        int i = 88;

        ob.test();
        ob.test(10,20);
        result = ob.test(123.25);
        System.out.println(result);
        ob.test(i);
    }
}
