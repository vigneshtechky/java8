package learning09092026;

import com.sun.org.apache.xpath.internal.objects.XNumber;

public class DemoContinue {
    public static void main(String[] args) {
        printsum(20);
        //sum of first 20 odd numbers.

    }

    public static void printsum(int numb) {
        int sum = 0;
        for (int i = 1; i <= numb; i++) {
            if (i % 2 == 0) {
                continue;

            }
            sum = sum + i;
        }
        System.out.println("sum is :" + sum);
    }
}
