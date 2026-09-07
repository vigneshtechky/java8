package learning07092026;

import java.sql.SQLOutput;

public class Learning {
    public static void main(String[] args) {
        table();

    }


    public static void table() {
        //for loop syntax, for(inti, conditon, inc/dec/assignment){
//    }





        int n = 0;
        int i = 10;
        int q =  n / i;
        int r = n % i;
        System.out.println("number: " + n);
        System.out.println("divide value:" + i);
        System.out.println("remainder: " + r);
        System.out.println("quotient: " + q);
        n = q;
        System.out.println("updated the n value: "+n);
    }
}
