package Chapter5;

public class ForEach3 {

    public static void main(String[] args) {

        int sum = 0;
        int[][][] nums = new int[3][5][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 3; k++) {
                    nums[i][j][k] = (i + 1) * (j + 1) * (k + 1);
                    sum += nums[i][j][k];
                }
            }
            System.out.println(sum);


            for (int[][] num : nums) {
                for (int[] p : num) {
                    for (int i1 : p) {
                        System.out.println(i1);
                        sum += i1;
                    }
                }
                System.out.println(sum);
            }
        }
    }
}
