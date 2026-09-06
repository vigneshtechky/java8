package loopingstatements;

public class ForLoop {
    //iteration statments or looping statmemts
    //for loop,while, do-while
    //for loop
    public static void main(String[] args)
    {
        System.out.println("program started");
        learnForLoop();
        System.out.println("program completed");
    }


    public static void learnForLoop()

    {
        //for(intializtion, condition, increment/decrement--> ++/--/+=/assignmentOperator)--syntax

        int number = 10;

        for (int i = 0; i <= number; i = i + 1) {

            System.out.println(i);

        }

    }
}
