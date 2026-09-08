package learning07092026;

public class Practise {

    public static void main(String[] args) {
        int input = 123456;
        System.out.println("input is:" + input);
        int result = reversenumber(input);
        System.out.println("output is:" + result);


    }

    public static int reversenumber(int number) {
        int reverse = 0;
        for (int i = number; i > 0; i = i / 10){
            int r = i % 10;
            int fr = (reverse * 10) + r;
            reverse = fr;
        }
        return reverse;
    }
}
