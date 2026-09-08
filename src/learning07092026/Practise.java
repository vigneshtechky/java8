package learning07092026;

import java.io.FilterOutputStream;

public class Practise {

    public static void main(String[] args) {
        int input = 114411;


        int result = reversenumber(input);

        if (input == result) {
            System.out.println("Both values are same " + input + ": number is palindrome ");
        } else {
            System.out.println("Both values are not same " + input + ": number is not a palindrome");
        }


    }

    public static int reversenumber(int number) {
        int reverse = 0;
        for (int i = number; i > 0; i = i / 10) {
            int r = i % 10;
            int fr = (reverse * 10) + r;
            reverse = fr;
        }
        return reverse;
    }
}
