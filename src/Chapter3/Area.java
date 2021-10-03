package Chapter3;

public class Area {
    public static void main(String[] args) {
        double pi, r, a;
        r = 10.8;
        pi = 3.1416;
        a = pi * r * r;
        System.out.println("the area of circle is " + a);


        int q = 20;
        int b = 25;
        double c = Math.sqrt((q * q) + (b * b));
        int angle_qb = 90;
        int angle_bc = 43;
        int angle_qc = 47;
        double sin_angle_bc = q / c;
        double cos_angle_bc = b / c;
        System.out.println(sin_angle_bc + "," + cos_angle_bc);


    }

}
