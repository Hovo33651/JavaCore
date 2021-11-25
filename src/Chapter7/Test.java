package Chapter7;

public class Test {

    int a;
    public int b;
    private int c;

    Test(){

    }

    Test(int i){
        a = i;
    }

    Test incrByTen(){
        Test tmp = new Test(a+10);
        return tmp;
    }

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    void meth(Test p){
        p.a *= 2;
        p.b /= 2;
    }

    void setC(int i){
        c = i;
    }
    int getC(){
        return c;
    }
}