package learning09092026;

public class BreakDemo {
    public static void main(String[] args) {
        int choice = 5;
        switch (choice) {

            case 1:

                System.out.println("you selected Addition ");
                int a = 20;
                int b = 30;
                int result = a + b;
                System.out.println("result is :" + result);
                break;

            case 2:

                System.out.println("you selected subtraction");
                int x = 20;
                int y = 30;
                int answer = x - y;
                System.out.println("result is :" + answer);
                break;

            case 3:

                System.out.println("you selected multiplication");
                int m = 20;
                int l = 30;
                int fr = m * l;
                System.out.println("result is :" + fr);
                break;

            case 4:
                System.out.println("you selected division");
                int c = 20;
                int d = 30;
                int print = c - d;
                System.out.println("result is :" + print);
                break;

            default:
                System.out.println("invalid choice");

        }

    }
}
