package Chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        mybox.depth = 10;
        mybox.height = 15;
        mybox.width = 25;

        vol = mybox.depth * mybox.height * mybox.width;
        System.out.println("volume is " + vol);
    }
}
