package Chapter6;

public class Box1 {
    double width;
    double height;
    double depth;

    Box1(double depth, double height, double width) {
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    double volume() {
        return depth * width * height;
    }
}

class Test {

    public static void main(String[] args) {

        Box1 mybox = new Box1(10, 25, 54);

        double vol = mybox.volume();

        System.out.println(vol);


    }


}

