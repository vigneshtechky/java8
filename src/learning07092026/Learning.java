package learning07092026;

import java.sql.SQLOutput;

public class Learning {
    public static void main(String[] args) {
        reverseNumber();

    }


    public static void reverseNumber() {
        //for loop syntax, for(inti, conditon, inc/dec/assignment){
//    }

        int number =1234;
        for(int i =number; i>0; i=i/10){
            int r = i%10;
            System.out.print(r);

        }
        System.out.println();


    }
}
