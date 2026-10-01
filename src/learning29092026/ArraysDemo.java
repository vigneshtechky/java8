package learning29092026;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] input = new int[]{4, 9, 2, 1, 6, 8};
        allPosibilities(input);
    }


    public static void allPosibilities(int[] nums) {

        int count = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = 0; j <= nums.length - 1; j++) {
                if (i == j) {
                    continue;
                }
                count = count + 1;
                System.out.println(nums[i] + " " + nums[j]);
            }
        }
        System.out.println("count:" + count);
    }
}
