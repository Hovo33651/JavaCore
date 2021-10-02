package Chapter3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 300;
        double d = 325.548;

        b = (byte) i;
        System.out.println("conversion of type int into type byte");
        System.out.println("i = " + i + "," + "\n" + "b = " + b);
        System.out.println("conversion of type double into type int");
        i = (int) d;
        System.out.println("double d = " + d + "," + "\n" + "int d = " + i);
        // or
        d =(int) d;
        System.out.println("conversed  ="+ d);
        System.out.println("conversion of type double into type byte");
        b = (byte) d;
        System.out.println("byte conversed d = " + b);





    }
}
