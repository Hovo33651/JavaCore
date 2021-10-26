package Chapter6;

public class BoxDemo4 {
    public static void main(String[] args) {

        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.width = 10;
        mybox1.depth = 15;
        mybox1.height = 20;

        mybox2.width = 10;
        mybox2.depth = 15;
        mybox2.height = 10;

        vol = mybox1.volume();
        vol = mybox2.volume();

    }
}
