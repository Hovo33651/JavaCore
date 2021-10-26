package Chapter6;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.width = 10;
        mybox1.height = 15;
        mybox1.depth = 10;

        mybox2.depth = 25;
        mybox2.height = 20;
        mybox2.width = 15;

        vol = mybox1.depth * mybox1.height * mybox1.width;
        System.out.println("Volume is " + vol);

        vol = mybox2.depth * mybox2.height * mybox2.width;
        System.out.println("Volume is " + vol);


    }
}
