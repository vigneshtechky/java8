package learning11092026;

public class DivisibleBY7DoWhile {
    public static void main(String[] args) {
        String result = divisibleBy7(150, 200);
        System.out.println(result);
    }

    public static String divisibleBy7(int start, int end) {
        String result = " ";
        int i = start;
        do {
            if (i % 7 == 0) {
                result = result + i + " ";
            }
            i++;
        } while (i <= end);
        return result;

    }
}
