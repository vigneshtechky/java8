package learning11092026;

public class PractiseWhile {
    public static void main(String[] args) {

        String result = evenNumbers(200, 500);
        System.out.println(result);
    }

    public static String evenNumbers(int start, int end) {
        String result = "";
        int i = start;

        while (i <= end) {
            if (i % 2 == 0) {
                result = result + i +  " ";
            }
            i++;
        }
        return result;
    }


}