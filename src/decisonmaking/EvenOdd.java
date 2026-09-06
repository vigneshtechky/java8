package decisonmaking;

public class EvenOdd {

    public static void main(String[] args) {
//      int number =   evenorodd(3);
       int result =  smallestEvenMultiple(3);
        System.out.println(result);
    }

    public static int  evenorodd(int number){
        if(number%2==0){
            System.out.println(number+" is even");
            return number;
        }
        else if(number%2==1){
            System.out.println(number+" is odd");
            return number;
        }else{
            System.out.println("taken negative values: "+number);
            return -1;
        }
    }


    public static int smallestEvenMultiple(int numb){
        if(numb%2==0){
            return numb;
        }
        else{
            int result = numb*2;
            return result;
        }
    }
}
