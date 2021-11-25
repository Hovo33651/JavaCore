package Chapter8;

public class RefDemo {

    public static void main(String[] args) {

        BoxWeight weightBox = new BoxWeight(3,5,7,8.74);
        Box plainBox = new Box();
        double vol;

        vol = weightBox.volume();
        System.out.println(vol);
        System.out.println(weightBox.weight);
        System.out.println();

        plainBox = weightBox;
        vol = plainBox.volume();

        System.out.println(vol);



    }
}
