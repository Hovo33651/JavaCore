package Chapter3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        if(b) System.out.println("b was " + b);
        b = false;
        if(b) System.out.println("b was not " + b);

        System.out.println("10 > 9 is " + (10 > 9 ));
    }
}
