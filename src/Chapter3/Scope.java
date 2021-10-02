package Chapter3;

public class Scope {
    public static void main(String[] args) {
        int x = 10;
        if(x==10){
            int y = 20;
            System.out.println(x +" "+y);
        }
        {int y = 30;
            System.out.println(x+" " + y);}

    }
}
