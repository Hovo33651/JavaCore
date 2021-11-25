package Homework;

public class A {
    String name;

    A(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class B{
    public static void main(String[] args) {

        A a = new A("Hovo");
        System.out.println(a);
    }
}

