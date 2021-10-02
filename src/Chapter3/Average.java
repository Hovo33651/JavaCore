package Chapter3;

public class Average {
    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 40, 50};
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result = result + nums[i];
            System.out.println("result is " + result / 5);


            /* [i] massive index (0 1 2 3 4)
            cikl 1` result = (0 + int num[0]) -> result = (0 + 10)/5 = 2
            cikl 2` result = (10 + int num[1]) -> result = (10 + 20)/5 = 6
            cikl 3` result = (30 + int num[2]) -> result = (30 + 30)/5 = 12
            cikl 4` result = (60 + int num[3]) -> result = (60 + 40)/5 = 20
            cikl 5` result = (100 + int num[4]) -> result = (100 + 50)/5 = 30





             */


        }
    }
}
