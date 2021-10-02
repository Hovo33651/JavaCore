package Chapter3;

public class Average {
    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 40, 50};
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result = result + nums[i];
            System.out.println("srednee znachenie ravno " + result / 5);


        }
    }
}
