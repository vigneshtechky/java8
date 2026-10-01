package learning29092026;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] input = new int[]{4, 9, 2, 1, 6, 8};
        int target = 11;
//        System.out.println(Arrays.toString(allPosibilities(input, target)));
        System.out.println(Arrays.toString(twosum(input, target)));


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


    public static int[] twosum(int[] nums, int target) {

        int count = 0;
        for (int i = 0; i <= nums.length - 2; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {

                count = count + 1;
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        System.out.println("count:" + count);
        return new int[]{};
    }
}
