package Chapter8;

public class A {
    int i, j;

    void showij(){
        System.out.println(i + " " + j);
    }
}
class B extends A{
    int k;

    void showk(){
        System.out.println(k);
    }

    void sum(){
        System.out.println(i+j+k);
    }
}

class SimpleInheritance{

    public static void main(String[] args) {

        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("superOb contains: ");
        superOb.showij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("subOb contains: ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("sum i j k in subOb: ");
        subOb.sum();
    }
}