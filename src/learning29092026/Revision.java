package learning29092026;

public class Revision {
    public static void main(String[] args) {
        int number = 5;
//        table(number);
        tableusingdowhile(7);

    }


    public static void table(int number) {

        for (int i = 0; i <= 10; i = i + 2) {
            if (i == 0) {
                continue;
            }
            System.out.println(number + " X " + i + " = " + (number * i));
        }

    }

    public static void tableusingdowhile(int number) {

        int i = 0;

        do {
            i = i + 1;
            System.out.println(number + " X " + i + " = " + (number * i));
        } while (i < 10);

    }

    public static void tableusinowhile(int number) {

        int i = 1;

       while (i < 10){
           System.out.println(number + " X " + i + " = " + (number * i));
            i = i + 1;
        }

    }
}
