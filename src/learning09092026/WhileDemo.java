package learning09092026;

public class WhileDemo {
    public static void main(String[] args) {
        int input = 11411;
        int result = whileLearningreverse(input);

        if(input == result){
            System.out.println("input: " + input + " result: " + result +" is a palindrome");
        }
        else{
            System.out.println("input: " + input + " result: " + result+" not a palindrome");
        }

    }

    public static int whileLearningreverse(int i) {

        int reverse = 0;
        while (i > 0) {
            //i=1234
            int r = i % 10;
            reverse = (reverse * 10) + r;
            i = i / 10;

        }
        return reverse;
    }
}
