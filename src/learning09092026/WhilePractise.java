package learning09092026;

import sun.security.mscapi.CPublicKey;

public class WhilePractise {
    public static void main(String[] args) {
        int input = 1122111;
        int result = whileLearningreverse1(input);


        if (input == result) {
            System.out.println("input :" + input + "result :" + result + "is a palindrome");
        } else {
            System.out.println("input :" + input + "result :" + result + "is not a palindrome");

        }
    }

        public static int whileLearningreverse1 ( int i){
            int reverse = 0;
            while (i > 0) {
                int r = i % 10;
                reverse = (reverse * 10) + r;
                i = i / 10;
            }

         return reverse;
    }
}
