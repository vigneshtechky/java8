package learning07092026;

import java.sql.SQLOutput;

public class Learning {

    public static void main(String[] args) {
        reverseNumber();
//        reverse(1534236469);


    }

//    public static long reverse(int numbers) {
//        long number =(long) numbers;
//        long temp = number;
//        boolean isNegative = false;
//        if(number<0l){
//            isNegative= true;
//            number = (temp - temp)-temp;
//        }
//        long reverse =0;
//        for (long i = number; i > 0; i = i / 10) {
//            long r = i % 10;
//            long fr  = (reverse*10)+r;
//            reverse = fr;
//
//        }
//        if(isNegative){
//            reverse = reverse-reverse-reverse;
//        }
//        System.out.println(reverse);
//        return reverse;
//    }


    public static void reverseNumber() {
        //for loop syntax, for(inti, conditon, inc/dec/assignment){
//    }

        long number = 1534236469;
        long temp = number;
        boolean isNegative = false;
        if(number<0){
            isNegative= true;
            number = (temp - temp)-temp;
        }
        long reverse =0;
        for (long i = number; i > 0; i = i / 10) {
            long r = i % 10;
            long fr  = (reverse*10)+r;
            reverse = fr;
            System.out.println(fr);

        }
        if(isNegative){
           reverse = reverse-reverse-reverse;
        }

        System.out.println(reverse);


    }
}
