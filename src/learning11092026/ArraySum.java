package learning11092026;

public class ArraySum {
    public static void main(String[] args) {


        int[] numbers = {2, 5, 1, 9, 6};
        int result = calculateSum(numbers);
        System.out.println("sum is :" + result);
    }


    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
}
