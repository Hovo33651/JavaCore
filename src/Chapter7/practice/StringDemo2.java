package Chapter7.practice;

public class StringDemo2 {
    public static void main(String[] args) {

        String strOb1 = "First string";
        String strOb2 = "Second string";
        String strOb3 = strOb1;

        System.out.println("The length of string strOb1: " +
                strOb1.length());
        System.out.println("Index 3 of string strOb1 contains symbol " +
                strOb1.charAt(3));

        if (strOb1.equals(strOb2))
            System.out.println("strOb1 == strOb2");
        else
            System.out.println("strOb1 != strOb2");

    }

}

