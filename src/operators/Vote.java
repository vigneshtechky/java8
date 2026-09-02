package operators;

public class Vote {


    public static void main(String[] args) {
        checkElligibleToVote();

    }

    public static void checkElligibleToVote() {
        //hardcoded value repating a value in multiple times, if we change the value, multiple places we need to change.
        int age = 23;
        boolean b = age > 18;
        System.out.println(b);
    }
}
