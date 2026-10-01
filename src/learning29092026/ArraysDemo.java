package learning29092026;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] input = new int[]{4, 9, 2, 1, 6, 8};
        int target = 11;
        System.out.println(Arrays.toString(allPosibilities(input, target)));
    }


    public static int[] allPosibilities(int[] nums, int target) {

        int count = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {
                if (i == j) {
                    continue;
                }
                count = count + 1;
                if (nums[i] + nums[j] == target) {
                    return new int[]{nums[i], nums[j]};
                }
            }
        }
        System.out.println("count:" + count);
        return new int[]{};
    }
}
