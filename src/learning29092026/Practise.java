package learning29092026;

public class Practise {
    public static void main(String[] args) {
        int[] nums = {3, 8, 13, 170};
        int target = 30;
        int[] result = twosum(nums, target);
        System.out.println("output [" + result[0] + " ," + result[1] + "]");
    }

    public static int[] twosum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1;j<nums.length;j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{-1 ,-1};
    }
}
