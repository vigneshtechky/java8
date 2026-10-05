package learning29092026;

public class practise1 {
    public static void main(String[] args) {

        pattern(5);
    }


    //patterns
//    1 1 1 1 1
//      1 1 1 1
//        1 1 1
//          1 1
//            1


    public static void pattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}