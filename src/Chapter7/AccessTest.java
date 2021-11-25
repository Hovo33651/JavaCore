package Chapter7;

public class AccessTest {

    public static void main(String[] args) {

        Test ob = new Test();

        ob.a = 10;
        ob.b = 20;

        ob.setC(100);

        System.out.println(ob.getC());
    }
}
