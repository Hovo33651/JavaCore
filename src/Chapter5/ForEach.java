package Chapter5;

public class ForEach {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int x : nums) {
            System.out.println(x);
            sum += x;
        }
        System.out.println(sum);
    }
}
