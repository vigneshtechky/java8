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

        int count = 0;

        for (int i = 0; i <= 500; i = i + 4) {
            count = count+1;
            System.out.println("count is " + count);

        }

    }
}
