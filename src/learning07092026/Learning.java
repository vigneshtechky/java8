package learning07092026;

public class Learning {
    public static void main(String[] args) {
        table();
    }


    public static void table() {
        int n = 25;
//        System.out.println(25/2);

        for (int i = 1; i <= 10; i = i + 1) {
            int result = n * i;
            System.out.println(n + "*" + i + "=" + result);
        }
    }

}


