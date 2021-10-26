package Chapter6;

public class BoxDemo3 {
    public static void main(String[] args) {

        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.width = 10;
        mybox1.height = 15;
        mybox1.depth = 10;

        mybox2.depth = 25;
        mybox2.height = 20;
        mybox2.width = 15;

        mybox1.volume();
        mybox2.volume();

    }
}
