package learning07092026;

public class ReverseANumber {


    public static void main(String[] args) {
        int input = 123456;
        System.out.println("input is: " + input);
        int result = reverseNumber(input);
        System.out.println("output is: " + result);

    //    String name = "1234";
      //  StringBuffer sb = new StringBuffer(name);
        //System.out.println(sb.reverse());


    }

    public static int reverseNumber(int number) {

        int temp = number;
 //       boolean isNegative = false;
 //       if (number < 0) {
 //           isNegative = true;
 //           number = (temp - temp) - temp;
  //      }
        int reverse = 0;
        for (int i = number; i > 0; i = i / 10) {
            int r = i % 10;
            int fr = (reverse * 10) + r;
            reverse = fr;
        }
      //  if (isNegative) {
        //   reverse = reverse - reverse - reverse;
     //   }

        return reverse;

    }
}
