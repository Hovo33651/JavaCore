package Chapter7;

public class OverloadDemo {

    void test() {
        System.out.println("no argument");
    }


    void test(int a, int b){
        System.out.println(a + " " + b);
    }

    double test(double a){
        System.out.println(a);
        return a*a;
    }


}

