package operators;

public class Vote {


    public static void main(String[] args) {
        int age = 23;
        checkElligibleToVote(age);

    }

    public static void checkElligibleToVote(int age) {
        //hardcoded value repating a value in multiple times, if we change the value, multiple places we need to change.
        boolean b = age > 18;
        if (b) {
            System.out.println("egible for vote: " + age);
        }
        System.out.println(b);

    }
}
