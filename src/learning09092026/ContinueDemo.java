package learning09092026;

public class ContinueDemo {
    public static void main(String[] args) {
        printsum(10);
    }

    public static void printsum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if(i%2==0){
                continue;
            }
            sum = sum + i;
        }
        System.out.println("sum is " + sum);
    }
}
